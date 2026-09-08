#!/bin/bash
set -euo pipefail

SPEC_FILE="${SPEC_FILE:-apollo-openapi.yaml}"
SITE_DIR="${SITE_DIR:-site}"
REDOCLY_VERSION="2.51.2"

usage() {
  cat <<'EOF'
Usage: ./scripts/build-docs.sh [--help]

Builds static Redoc HTML docs for every released git tag (vX.Y.Z) plus the
current HEAD ("next") from apollo-openapi.yaml, into site/ (gitignored build
output):

  site/index.html        - copy of the latest successfully-built tag's docs
  site/next/index.html    - built from the current working tree HEAD
  site/vX.Y.Z/index.html  - one per released tag
  site/versions.html      - generated index linking every built version

Options:
  --help    Show this help.
EOF
}

for arg in "$@"; do
  case "$arg" in
    --help|-h)
      usage
      exit 0
      ;;
    *)
      echo "Unknown argument: $arg" >&2
      usage >&2
      exit 2
      ;;
  esac
done

command -v npx >/dev/null 2>&1 || { echo "npx is required" >&2; exit 127; }
REDOCLY=(npx --yes "@redocly/cli@${REDOCLY_VERSION}")

WORK_DIR="$(mktemp -d)"
trap 'rm -rf "$WORK_DIR"' EXIT

echo "Cleaning previous site output..."
rm -rf "$SITE_DIR"
mkdir -p "$SITE_DIR"

# build_one <spec-path> <title-label> <output-subdir>
build_one() {
  local spec_path="$1" label="$2" subdir="$3"
  mkdir -p "$SITE_DIR/$subdir"
  "${REDOCLY[@]}" build-docs "$spec_path" \
    --output "$SITE_DIR/$subdir/index.html" \
    --title "Apollo OpenAPI ($label)" \
    --lint-config off
}

echo "Building next (unreleased HEAD)..."
build_one "$SPEC_FILE" "next, unreleased" "next"

TAGS=()
while IFS= read -r tag; do
  [ -n "$tag" ] && TAGS+=("$tag")
done < <(git tag -l 'v*' --sort=v:refname)
if [ "${#TAGS[@]}" -eq 0 ]; then
  echo "No vX.Y.Z tags found" >&2
  exit 1
fi

BUILT_TAGS=()
for tag in "${TAGS[@]}"; do
  echo "Building $tag..."
  if ! git show "$tag:$SPEC_FILE" > "$WORK_DIR/$tag.yaml" 2>/dev/null; then
    echo "WARN: $tag does not contain $SPEC_FILE, skipping" >&2
    continue
  fi
  if build_one "$WORK_DIR/$tag.yaml" "$tag" "$tag"; then
    BUILT_TAGS+=("$tag")
  else
    echo "WARN: build-docs failed for $tag, skipping" >&2
    rm -rf "${SITE_DIR:?}/$tag"
  fi
done

if [ "${#BUILT_TAGS[@]}" -eq 0 ]; then
  echo "No tag built successfully" >&2
  exit 1
fi

LATEST_TAG="${BUILT_TAGS[${#BUILT_TAGS[@]}-1]}"
echo "Latest version: $LATEST_TAG"
cp "$SITE_DIR/$LATEST_TAG/index.html" "$SITE_DIR/index.html"

echo "Generating versions.html..."
{
  echo '<!doctype html><html lang="en"><head><meta charset="utf-8">'
  echo '<title>Apollo OpenAPI &mdash; Versions</title></head><body>'
  echo '<h1>Apollo OpenAPI &mdash; Versions</h1>'
  echo '<ul>'
  echo "<li><a href=\"./next/\">next (unreleased, main HEAD)</a></li>"
  for ((i = ${#BUILT_TAGS[@]} - 1; i >= 0; i--)); do
    tag="${BUILT_TAGS[$i]}"
    if [ "$tag" = "$LATEST_TAG" ]; then
      echo "<li><a href=\"./$tag/\">$tag (latest)</a></li>"
    else
      echo "<li><a href=\"./$tag/\">$tag</a></li>"
    fi
  done
  echo '</ul></body></html>'
} > "$SITE_DIR/versions.html"

echo "Done. Built $((${#BUILT_TAGS[@]} + 1)) versions (${#BUILT_TAGS[@]} tags + next)."
