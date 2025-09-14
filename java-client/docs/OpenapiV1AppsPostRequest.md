

# OpenapiV1AppsPostRequest



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**app** | [**OpenAppDTO**](OpenAppDTO.md) |  |  |
|**assignAppRoleToSelf** | **Boolean** | 是否将应用角色分配给当前用户。当设置为true时，当前token用户将获得该应用的完全操作权限 |  |
|**admins** | **List&lt;String&gt;** | 应用管理员用户名列表。应用负责人默认具有项目管理员权限。管理员可以创建命名空间、集群并分配用户权限 |  |



