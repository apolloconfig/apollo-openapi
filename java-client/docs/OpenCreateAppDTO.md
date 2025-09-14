

# OpenCreateAppDTO

创建Apollo应用的请求数据传输对象，包含创建应用所需的所有信息

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assignAppRoleToSelf** | **Boolean** | 是否将应用角色分配给当前用户。当设置为true时，当前token用户将获得该应用的完全操作权限 |  [optional] |
|**admins** | **List&lt;String&gt;** | 应用管理员用户名列表。应用负责人默认具有项目管理员权限。管理员可以创建命名空间、集群并分配用户权限 |  [optional] |
|**app** | [**OpenAppDTO**](OpenAppDTO.md) |  |  [optional] |



