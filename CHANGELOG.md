# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [0.3.3] - 2026-05-24

### Added

- Add optional `operator` query parameters to AccessKey activation and deactivation APIs.

## [0.3.2] - 2026-05-24

### Fixed

- Mark `GET /openapi/v1/envs/{env}/releases/{releaseId}` `releaseId` as `int64` to match Apollo release identifiers.

## [0.3.1] - 2026-05-24

### Added

- Add the optional `toReleaseId` query parameter to the release rollback API for rollback-to-release support.
- Make branch delete and branch rule update `operator` query parameters optional for Portal user-session compatibility.
- Preserve Java client and Spring server compatibility overloads from versions before 0.3.1.

## [0.3.0] - 2026-05-16

### Changed

- Align `POST /openapi/v1/apps` success response with the legacy Java client's void `createApp` contract.
- Bump generated package metadata and OpenAPI document version from `0.2.0` to `0.3.0`.

## [0.2.0] - 2026-05-10

### Added

- Add AccessKey management APIs for listing, creating, deleting, enabling, and disabling AccessKeys.
- Add permission management APIs for app, namespace, environment namespace, cluster namespace, root permission, AppMaster, and create-application roles.
- Add AppNamespace management grouping and usage lookup APIs.
- Add Namespace Lock management grouping.
- Add missing environment and missing namespace discovery/creation APIs.
- Add namespace creation, deletion, usage, and associated public namespace lookup APIs.
- Add instance lookup APIs by namespace, by release, and by namespace excluding releases.
- Add item text batch update, diff, revocation, synchronization, and validation APIs.
- Add release comparison API.
- Add generated Java, Python, TypeScript, Rust, and Spring Boot 2 artifacts for the expanded OpenAPI spec.

### Changed

- Bump package generation metadata from `0.0.1` to `0.2.0`.
- Change the OpenAPI document version from `1.0.0` to `0.2.0`.
- Remove generated OpenAPI document version comments to reduce churn on future version-only releases.
- Use a Python generator template override to fix an upstream generated-code typo at the source.
- Move AppNamespace operations from `Namespace Management` to `AppNamespace Management`.
- Move namespace lock lookup from `Namespace Management` to `Namespace Lock Management`.
- Move branch merge grouping from `Release Management` to `Namespace Branch Management`.
- Rename several operation IDs to match the generated API groups, including `createNamespace` to `createAppNamespace`, `loadNamespace` to `findNamespace`, and `getBranchItems` to `findBranchItems`.
- Make several `operator` query parameters optional and add optional `operator` parameters to additional mutation APIs.
- Add optional `extendInfo` query parameters to namespace and app namespace lookup APIs.
- Add fields to existing schemas, including `OpenAppDTO.ownerDisplayName`, `OpenItemDTO.extendInfo`, `OpenNamespaceDTO.extendInfo`, and `OpenNamespaceLockDTO.isEmergencyPublishAllowed`.
- Expand `ExceptionResponse` into a structured error model with `status`, `message`, `timestamp`, and `exception`.

### Removed

- Remove old generic wrapper schemas: `MultiResponseEntity`, `RichResponseEntity`, and `SuccessEmptyResponse`.
- Remove or replace generated model names including `KVEntity`, `OpenReleaseBO`, `OpenItemDiffs`, `OpenItemChangeSets`, `OpenNamespaceSyncModel`, `OpenPageDTOOpenInstanceDTO`, and `OpenPageDTOOpenItemDTO`.
- Remove unused `OpenCreateItemDTO` schema from the generated SDK surface.

### Breaking Changes

- Rename `/openapi/v1/apps/{appId}/miss_envs` to `/openapi/v1/apps/{appId}/miss-envs`.
- Replace `/openapi/v1/apps/{appId}/envs/{env}/clusters/{clusterName}/namespaces/integrity-check` with missing namespace lookup and creation APIs.
- Replace namespace public association and link endpoints with the current associated public namespace and namespace usage APIs.
- Replace `PATCH /openapi/v1/envs/{env}/apps/{appId}/clusters/{clusterName}/namespaces/{namespaceName}/branches/{branchName}` with `POST` on the same path for branch merge.
- Rename item helper endpoints from `batchUpdate`, `compare`, `revert`, `sync`, and `validate` to the current `items`, `diff`, `revocation`, `synchronize`, and `validation` paths.
- Replace release instance lookup endpoints with `/openapi/v1/envs/{env}/instances/by-release` and `/openapi/v1/envs/{env}/instances/by-namespace-and-releases-not-in`.
