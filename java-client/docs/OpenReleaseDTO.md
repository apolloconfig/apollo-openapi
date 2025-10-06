

# OpenReleaseDTO

Apollo发布信息数据传输对象，表示一次配置发布的完整信息

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataChangeCreatedBy** | **String** | 发布创建者用户名，记录是谁创建了这次发布 |  [optional] |
|**dataChangeLastModifiedBy** | **String** | 发布最后修改者用户名，记录最后一次修改发布信息的用户 |  [optional] |
|**dataChangeCreatedTime** | **String** | 发布创建时间，ISO 8601格式的时间戳 |  [optional] |
|**dataChangeLastModifiedTime** | **String** | 发布最后修改时间，ISO 8601格式的时间戳 |  [optional] |
|**id** | **Long** | 发布记录的唯一标识符，系统自动生成 |  [optional] |
|**appId** | **String** | 所属应用的唯一标识符 |  [optional] |
|**clusterName** | **String** | 所属集群的名称 |  [optional] |
|**namespaceName** | **String** | 所属命名空间的名称 |  [optional] |
|**name** | **String** | 发布名称，用于标识这次发布的版本或描述 |  [optional] |
|**configurations** | **Map&lt;String, String&gt;** |  |  [optional] |
|**comment** | **String** | 发布备注，描述本次发布的变更内容和目的 |  [optional] |
