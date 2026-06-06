# OpenConsumerCreateRequestDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_id** | Option<**String**> | 第三方应用ID | [optional]
**allow_create_application** | Option<**bool**> | 是否允许该Consumer Token创建应用 | [optional][default to false]
**allow_manage_users** | Option<**bool**> | 是否允许该Consumer Token管理用户 | [optional][default to false]
**name** | Option<**String**> | 第三方应用名称 | [optional]
**org_id** | Option<**String**> | 部门ID | [optional]
**org_name** | Option<**String**> | 部门名称 | [optional]
**owner_name** | Option<**String**> | 负责人用户名 | [optional]
**rate_limit_enabled** | Option<**bool**> | 是否开启限流 | [optional][default to false]
**rate_limit** | Option<**i32**> | 限流QPS，0表示不限流 | [optional][default to 0]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
