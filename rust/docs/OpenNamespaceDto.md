# OpenNamespaceDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_change_created_by** | Option<**String**> | 命名空间创建者用户名，记录是谁创建了这个命名空间 | [optional]
**data_change_last_modified_by** | Option<**String**> | 命名空间最后修改者用户名，记录最后一次修改命名空间信息的用户 | [optional]
**data_change_created_time** | Option<**String**> | 命名空间创建时间，ISO 8601格式的时间戳 | [optional]
**data_change_last_modified_time** | Option<**String**> | 命名空间最后修改时间，ISO 8601格式的时间戳 | [optional]
**app_id** | Option<**String**> | 所属应用的唯一标识符 | [optional]
**cluster_name** | Option<**String**> | 所属集群的名称 | [optional]
**namespace_name** | Option<**String**> | 命名空间名称，在同一应用和集群下唯一标识一个命名空间 | [optional]
**comment** | Option<**String**> | 命名空间备注说明，描述命名空间的用途 | [optional]
**format** | Option<**String**> | 命名空间格式类型，如properties、xml、json、yml等 | [optional]
**is_public** | Option<**bool**> | 是否为公共命名空间，公共命名空间可以被其他应用关联使用 | [optional]
**items** | Option<[**Vec<crate::models::OpenItemDto>**](OpenItemDTO.md)> | 命名空间包含的配置项列表 | [optional]
**extend_info** | Option<[**crate::models::OpenNamespaceExtendDto**](OpenNamespaceExtendDTO.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
