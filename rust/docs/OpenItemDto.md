# OpenItemDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_change_created_by** | Option<**String**> | 配置项创建者用户名，记录是谁创建了这个配置项 | [optional]
**data_change_last_modified_by** | Option<**String**> | 配置项最后修改者用户名，记录最后一次修改配置的用户 | [optional]
**data_change_created_time** | Option<**String**> | 配置项创建时间，ISO 8601格式的时间戳 | [optional]
**data_change_last_modified_time** | Option<**String**> | 配置项最后修改时间，ISO 8601格式的时间戳 | [optional]
**key** | Option<**String**> | 配置项的键名，在同一命名空间内唯一标识一个配置项 | [optional]
**r#type** | Option<**i32**> | 配置项类型，0表示普通配置项，1表示文件类型配置项 | [optional]
**value** | Option<**String**> | 配置项的值，可以是字符串、数字、JSON等格式 | [optional]
**comment** | Option<**String**> | 配置项的注释说明，用于描述配置项的用途和含义 | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
