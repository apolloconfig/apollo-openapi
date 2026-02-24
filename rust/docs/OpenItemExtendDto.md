# OpenItemExtendDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**namespace_id** | Option<**i64**> | 所属命名空间的ID | [optional]
**is_modified** | Option<**bool**> | 是否有未发布的修改 | [optional]
**is_deleted** | Option<**bool**> | 是否被标记为删除（未发布） | [optional]
**is_newly_added** | Option<**bool**> | 是否为新添加的配置项（未发布） | [optional]
**new_value** | Option<**String**> | 新的值 | [optional]
**old_value** | Option<**String**> | 上一次发布的值，用于对比变更 | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
