# apollo-openapi

![OpenAPI](https://img.shields.io/badge/spec-OpenAPI%203.0.1-blue)

This repository maintains the Apollo OpenAPI contract. The source of truth is
[`apollo-openapi.yaml`](apollo-openapi.yaml).

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
