# NamespaceGrayDelReleaseDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**release_title** | Option<**String**> | 发布标题，用于标识这次灰度删除发布的名称或版本号 | [optional]
**release_comment** | Option<**String**> | 发布备注，详细描述本次灰度删除发布的目的和删除的配置项 | [optional]
**released_by** | Option<**String**> | 发布操作者用户名，记录是谁执行了这次灰度删除发布操作 | [optional]
**is_emergency_publish** | Option<**bool**> | 是否为紧急发布，紧急发布可能会跳过某些审核流程 | [optional]
**gray_del_keys** | Option<**Vec<String>**> | 需要在灰度发布中删除的配置项键名列表 | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
