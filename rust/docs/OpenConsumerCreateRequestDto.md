# OpenConsumerCreateRequestDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_id** | **String** | 第三方应用ID | [required]
**allow_create_application** | Option<**bool**> | 是否允许该Consumer Token创建应用 | [optional][default to false]
**allow_manage_users** | Option<**bool**> | 是否允许该Consumer Token管理用户 | [optional][default to false]
**name** | **String** | 第三方应用名称 | [required]
**org_id** | **String** | 部门ID | [required]
**org_name** | Option<**String**> | 部门名称 | [optional]
**owner_name** | **String** | 负责人用户名 | [required]
**rate_limit_enabled** | Option<**bool**> | 是否开启限流 | [optional][default to false]
**rate_limit** | Option<**i32**> | 限流QPS，rateLimitEnabled 为 true 时必须大于 0；未开启限流时 0 表示不限流 | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
