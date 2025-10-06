

# NamespaceGrayDelReleaseDTO

命名空间灰度删除发布请求数据传输对象，用于创建删除特定配置项的灰度发布

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**releaseTitle** | **String** | 发布标题，用于标识这次灰度删除发布的名称或版本号 |  [optional] |
|**releaseComment** | **String** | 发布备注，详细描述本次灰度删除发布的目的和删除的配置项 |  [optional] |
|**releasedBy** | **String** | 发布操作者用户名，记录是谁执行了这次灰度删除发布操作 |  [optional] |
|**isEmergencyPublish** | **Boolean** | 是否为紧急发布，紧急发布可能会跳过某些审核流程 |  [optional] |
|**grayDelKeys** | **List&lt;String&gt;** | 需要在灰度发布中删除的配置项键名列表 |  [optional] |
