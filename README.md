# apollo-openapi

![OpenAPI](https://img.shields.io/badge/spec-OpenAPI%203.0.1-blue)
[![Docs](https://img.shields.io/badge/docs-API%20reference-blue)](https://shalk.github.io/apollo-openapi/)

This repository maintains the Apollo OpenAPI contract. The source of truth is
[`apollo-openapi.yaml`](apollo-openapi.yaml).

## 📖 API Reference

Browse the rendered API reference for every released version (plus `next`
for the unreleased `main` HEAD):

**https://shalk.github.io/apollo-openapi/**

See [all versions](https://shalk.github.io/apollo-openapi/versions.html).

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
