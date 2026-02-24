

# OpenItemDTO

Apollo配置项核心数据对象，仅包含键值及基础审计信息

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**key** | **String** | 配置项的键名，在同一命名空间内唯一标识一个配置项 |  [optional] |
|**value** | **String** | 配置项的值，可以是字符串、数字、JSON等格式 |  [optional] |
|**type** | **Integer** | 配置项类型 |  [optional] |
|**comment** | **String** | 配置项的注释说明，用于描述配置项的用途和含义 |  [optional] |
|**extendInfo** | [**OpenItemExtendDTO**](OpenItemExtendDTO.md) |  |  [optional] |
|**dataChangeCreatedBy** | **String** | 配置项创建者用户名，记录是谁创建了这个配置项 |  [optional] |
|**dataChangeLastModifiedBy** | **String** | 配置项最后修改者用户名，记录最后一次修改配置的用户 |  [optional] |
|**dataChangeCreatedTime** | **String** | 配置项创建时间，ISO 8601格式的时间戳 |  [optional] |
|**dataChangeLastModifiedTime** | **String** | 配置项最后修改时间，ISO 8601格式的时间戳 |  [optional] |
