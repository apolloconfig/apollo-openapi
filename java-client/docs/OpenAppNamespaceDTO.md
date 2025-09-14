

# OpenAppNamespaceDTO

Apollo应用命名空间数据传输对象，表示应用级别的命名空间配置信息

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataChangeCreatedBy** | **String** | 命名空间创建者用户名，记录是谁创建了这个应用命名空间 |  [optional] |
|**dataChangeLastModifiedBy** | **String** | 命名空间最后修改者用户名，记录最后一次修改命名空间信息的用户 |  [optional] |
|**dataChangeCreatedTime** | **String** | 命名空间创建时间，ISO 8601格式的时间戳 |  [optional] |
|**dataChangeLastModifiedTime** | **String** | 命名空间最后修改时间，ISO 8601格式的时间戳 |  [optional] |
|**name** | **String** | 命名空间名称，在同一应用内唯一标识一个命名空间 |  [optional] |
|**appId** | **String** | 所属应用的唯一标识符 |  [optional] |
|**format** | **String** | 命名空间格式类型，如properties、xml、json、yml等 |  [optional] |
|**isPublic** | **Boolean** | 是否为公共命名空间，公共命名空间可以被其他应用关联使用 |  [optional] |
|**appendNamespacePrefix** | **Boolean** | 对于公共命名空间，是否在命名空间名称前添加前缀 |  [optional] |
|**comment** | **String** | 命名空间备注说明，描述命名空间的用途和包含的配置类型 |  [optional] |



