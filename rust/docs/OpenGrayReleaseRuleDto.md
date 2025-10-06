# OpenGrayReleaseRuleDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_change_created_by** | Option<**String**> | 灰度规则创建者用户名，记录是谁创建了这个灰度发布规则 | [optional]
**data_change_last_modified_by** | Option<**String**> | 灰度规则最后修改者用户名，记录最后一次修改规则的用户 | [optional]
**data_change_created_time** | Option<**String**> | 灰度规则创建时间，ISO 8601格式的时间戳 | [optional]
**data_change_last_modified_time** | Option<**String**> | 灰度规则最后修改时间，ISO 8601格式的时间戳 | [optional]
**app_id** | Option<**String**> | 所属应用的唯一标识符 | [optional]
**cluster_name** | Option<**String**> | 所属集群的名称 | [optional]
**namespace_name** | Option<**String**> | 所属命名空间的名称 | [optional]
**branch_name** | Option<**String**> | 灰度分支名称，标识灰度发布的分支 | [optional]
**rule_items** | Option<[**Vec<crate::models::OpenGrayReleaseRuleItemDto>**](OpenGrayReleaseRuleItemDTO.md)> | 灰度发布规则项列表，包含具体的灰度规则条件 | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
