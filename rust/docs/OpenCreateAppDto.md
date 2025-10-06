# OpenCreateAppDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assign_app_role_to_self** | Option<**bool**> | 是否将应用角色分配给当前用户。当设置为true时，当前token用户将获得该应用的完全操作权限 | [optional]
**admins** | Option<**Vec<String>**> | 应用管理员用户名列表。应用负责人默认具有项目管理员权限。管理员可以创建命名空间、集群并分配用户权限 | [optional]
**app** | Option<[**crate::models::OpenAppDto**](OpenAppDTO.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
