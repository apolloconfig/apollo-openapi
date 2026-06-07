#!/bin/bash
set -euo pipefail

SPEC_FILE="${SPEC_FILE:-apollo-openapi.yaml}"
GENERATED_ROOT="build/generated"
PORTAL_OUTPUT_DIR="$GENERATED_ROOT/portal"
OPENAPI_GENERATOR_VERSION="7.20.0"

usage() {
  cat <<'EOF'
Usage: ./generate.sh [--verify]

Generates the Apollo Portal OpenAPI Spring interface smoke output under
build/generated/portal. Generated code is a temporary verification artifact and
is not tracked by this repository.

Options:
  --verify    Generate and assert the expected Portal compatibility surface.
  --help      Show this help.
EOF
}

VERIFY=false
for arg in "$@"; do
  case "$arg" in
    --verify)
      VERIFY=true
      ;;
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

if command -v npx >/dev/null 2>&1; then
  OPENAPI_GENERATOR=(npx --yes @openapitools/openapi-generator-cli)
elif command -v openapi-generator-cli >/dev/null 2>&1; then
  OPENAPI_GENERATOR=(openapi-generator-cli)
elif command -v openapi-generator >/dev/null 2>&1; then
  OPENAPI_GENERATOR=(openapi-generator)
else
  echo "openapi-generator, openapi-generator-cli, or npx is required." >&2
  exit 127
fi

export OPENAPI_GENERATOR_VERSION

JAVA_VERSION_LINE="$(java -version 2>&1 | head -n 1 || true)"
if [[ "$JAVA_VERSION_LINE" =~ \"([0-9]+) ]] && [ "${BASH_REMATCH[1]}" -ge 9 ]; then
  export JAVA_TOOL_OPTIONS="${JAVA_TOOL_OPTIONS:+$JAVA_TOOL_OPTIONS }--add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.lang=ALL-UNNAMED"
fi

echo "Cleaning generated Portal smoke output..."
rm -rf "$PORTAL_OUTPUT_DIR"

echo "Generating Apollo Portal Spring OpenAPI interfaces..."
"${OPENAPI_GENERATOR[@]}" generate \
  -i "$SPEC_FILE" \
  -g spring \
  -o "$PORTAL_OUTPUT_DIR" \
  --additional-properties=apiPackage=com.ctrip.framework.apollo.openapi.api,modelPackage=com.ctrip.framework.apollo.openapi.model,invokerPackage=com.ctrip.framework.apollo.openapi.invoker,interfaceOnly=true,useTags=true,dateLibrary=java8,useSpringBoot4=true \
  --skip-validate-spec

if [ "$VERIFY" = true ]; then
  API_DIR="$PORTAL_OUTPUT_DIR/src/main/java/com/ctrip/framework/apollo/openapi/api"
  MODEL_DIR="$PORTAL_OUTPUT_DIR/src/main/java/com/ctrip/framework/apollo/openapi/model"

  test -f "$API_DIR/UserManagementApi.java"
  test ! -f "$API_DIR/PortalUserManagementApi.java"

  for model_name in \
    OpenConsumerCreateRequestDTO \
    OpenConsumerInfoDTO \
    OpenConsumerSummaryDTO \
    OpenConsumerTokenDTO
  do
    test ! -f "$MODEL_DIR/$model_name.java"
  done

  echo "Portal generation verification passed."
fi
