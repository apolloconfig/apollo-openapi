# OpenItemChangeSets

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data_change_created_by** | Option<**String**> | 变更集合创建者用户名 | [optional]
**data_change_last_modified_by** | Option<**String**> | 变更集合最后修改者用户名 | [optional]
**data_change_created_by_display_name** | Option<**String**> | 创建者显示名 | [optional]
**data_change_last_modified_by_display_name** | Option<**String**> | 最后修改者显示名 | [optional]
**data_change_created_time** | Option<**String**> | 变更集合创建时间（ISO 8601） | [optional]
**data_change_last_modified_time** | Option<**String**> | 变更集合最后修改时间（ISO 8601） | [optional]
**create_items** | Option<[**Vec<crate::models::OpenItemDto>**](OpenItemDTO.md)> | 待创建的配置项列表 | [optional][default to []]
**update_items** | Option<[**Vec<crate::models::OpenItemDto>**](OpenItemDTO.md)> | 待更新的配置项列表 | [optional][default to []]
**delete_items** | Option<[**Vec<crate::models::OpenItemDto>**](OpenItemDTO.md)> | 待删除的配置项列表 | [optional][default to []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
