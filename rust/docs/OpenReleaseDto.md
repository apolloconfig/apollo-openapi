# OpenReleaseDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_change_created_by** | Option<**String**> | 发布创建者用户名，记录是谁创建了这次发布 | [optional]
**data_change_last_modified_by** | Option<**String**> | 发布最后修改者用户名，记录最后一次修改发布信息的用户 | [optional]
**data_change_created_time** | Option<**String**> | 发布创建时间，ISO 8601格式的时间戳 | [optional]
**data_change_last_modified_time** | Option<**String**> | 发布最后修改时间，ISO 8601格式的时间戳 | [optional]
**id** | Option<**i64**> | 发布记录的唯一标识符，系统自动生成 | [optional]
**app_id** | Option<**String**> | 所属应用的唯一标识符 | [optional]
**cluster_name** | Option<**String**> | 所属集群的名称 | [optional]
**namespace_name** | Option<**String**> | 所属命名空间的名称 | [optional]
**name** | Option<**String**> | 发布名称，用于标识这次发布的版本或描述 | [optional]
**configurations** | Option<**::std::collections::HashMap<String, String>**> |  | [optional]
**comment** | Option<**String**> | 发布备注，描述本次发布的变更内容和目的 | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
