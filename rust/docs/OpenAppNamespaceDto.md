# OpenAppNamespaceDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_change_created_by** | Option<**String**> | 命名空间创建者用户名，记录是谁创建了这个应用命名空间 | [optional]
**data_change_last_modified_by** | Option<**String**> | 命名空间最后修改者用户名，记录最后一次修改命名空间信息的用户 | [optional]
**data_change_created_time** | Option<**String**> | 命名空间创建时间，ISO 8601格式的时间戳 | [optional]
**data_change_last_modified_time** | Option<**String**> | 命名空间最后修改时间，ISO 8601格式的时间戳 | [optional]
**name** | Option<**String**> | 命名空间名称，在同一应用内唯一标识一个命名空间 | [optional]
**app_id** | Option<**String**> | 所属应用的唯一标识符 | [optional]
**format** | Option<**String**> | 命名空间格式类型，如properties、xml、json、yml等 | [optional]
**is_public** | Option<**bool**> | 是否为公共命名空间，公共命名空间可以被其他应用关联使用 | [optional]
**append_namespace_prefix** | Option<**bool**> | 对于公共命名空间，是否在命名空间名称前添加前缀 | [optional][default to true]
**comment** | Option<**String**> | 命名空间备注说明，描述命名空间的用途和包含的配置类型 | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
