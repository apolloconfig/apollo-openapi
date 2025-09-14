

# NamespaceReleaseDTO

命名空间发布请求数据传输对象，用于创建新的配置发布

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**releaseTitle** | **String** | 发布标题，用于标识这次发布的名称或版本号 |  [optional] |
|**releaseComment** | **String** | 发布备注，详细描述本次发布的变更内容和目的 |  [optional] |
|**releasedBy** | **String** | 发布操作者用户名，记录是谁执行了这次发布操作 |  [optional] |
|**isEmergencyPublish** | **Boolean** | 是否为紧急发布，紧急发布可能会跳过某些审核流程 |  [optional] |



