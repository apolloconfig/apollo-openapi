# OpenClusterDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_change_created_by** | Option<**String**> | 集群创建者用户名，记录是谁创建了这个集群 | [optional]
**data_change_last_modified_by** | Option<**String**> | 集群最后修改者用户名，记录最后一次修改集群信息的用户 | [optional]
**data_change_created_time** | Option<**String**> | 集群创建时间，ISO 8601格式的时间戳 | [optional]
**data_change_last_modified_time** | Option<**String**> | 集群最后修改时间，ISO 8601格式的时间戳 | [optional]
**name** | Option<**String**> | 集群名称，在同一应用和环境下唯一标识一个集群 | [optional]
**app_id** | Option<**String**> | 所属应用的唯一标识符 | [optional]
**id** | Option<**i64**> | 集群的唯一标识符 | [optional]
**parent_cluster_id** | Option<**i64**> | 父集群的ID | [optional]
**comment** | Option<**String**> | 集群的备注说明 | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
