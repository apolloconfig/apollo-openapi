# apollo-openapi

![OpenAPI](https://img.shields.io/badge/spec-OpenAPI%203.0.1-blue)
[![Docs](https://img.shields.io/badge/docs-API%20reference-blue)](https://openapi.apolloconfig.com/)

This repository maintains the Apollo OpenAPI contract. The source of truth is
[`apollo-openapi.yaml`](apollo-openapi.yaml).

## 📖 API Reference

Browse the rendered API reference for every released version (plus `next`
for the unreleased `main` HEAD):

**https://openapi.apolloconfig.com/**

See [all versions](https://openapi.apolloconfig.com/versions.html).

Documentation changes on `main` deploy automatically. A `v*` tag push starts
the deployment workflow on `main` using `workflow_dispatch`, avoiding the
[Pages tag deployment issue](https://github.com/actions/deploy-pages/issues/383).
The deployment verifies the published version index, homepage, `next`, latest
version, and the triggering release version against the generated files. To retry a
release deployment, run **Deploy API Docs** on `main` with `expected_tag` set
to the release tag.

Generated code is treated as a temporary verification artifact, not as
maintained source code or an official Apollo SDK. Apollo Portal pins a released
`apollo-openapi.yaml` tag and generates its Spring OpenAPI interfaces during
the Portal build.

To verify the spec can still generate the Portal OpenAPI surface:

```bash
./generate.sh --verify
```

The generated files are written under `build/generated/` and are intentionally
ignored by git.
