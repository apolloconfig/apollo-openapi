

# OpenNamespaceDTO

Apollo命名空间数据传输对象，表示一个完整的命名空间及其配置项

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataChangeCreatedBy** | **String** | 命名空间创建者用户名，记录是谁创建了这个命名空间 |  [optional] |
|**dataChangeLastModifiedBy** | **String** | 命名空间最后修改者用户名，记录最后一次修改命名空间信息的用户 |  [optional] |
|**dataChangeCreatedTime** | **String** | 命名空间创建时间，ISO 8601格式的时间戳 |  [optional] |
|**dataChangeLastModifiedTime** | **String** | 命名空间最后修改时间，ISO 8601格式的时间戳 |  [optional] |
|**appId** | **String** | 所属应用的唯一标识符 |  [optional] |
|**clusterName** | **String** | 所属集群的名称 |  [optional] |
|**namespaceName** | **String** | 命名空间名称，在同一应用和集群下唯一标识一个命名空间 |  [optional] |
|**comment** | **String** | 命名空间备注说明，描述命名空间的用途 |  [optional] |
|**format** | **String** | 命名空间格式类型，如properties、xml、json、yml等 |  [optional] |
|**isPublic** | **Boolean** | 是否为公共命名空间，公共命名空间可以被其他应用关联使用 |  [optional] |
|**items** | [**List&lt;OpenItemDTO&gt;**](OpenItemDTO.md) | 命名空间包含的配置项列表 |  [optional] |
|**extendInfo** | [**OpenNamespaceExtendDTO**](OpenNamespaceExtendDTO.md) |  |  [optional] |
