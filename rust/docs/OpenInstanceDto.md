# OpenInstanceDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**i64**> | 实例ID | [optional]
**app_id** | Option<**String**> | 实例所属应用ID | [optional]
**cluster_name** | Option<**String**> | 实例所属集群名称 | [optional]
**data_center** | Option<**String**> | 数据中心/机房标识 | [optional]
**ip** | Option<**String**> | 实例IP地址 | [optional]
**configs** | Option<[**Vec<crate::models::OpenInstanceConfigDto>**](OpenInstanceConfigDTO.md)> | 实例当前生效的配置列表 | [optional]
**data_change_created_time** | Option<**String**> | 数据创建时间（ISO 8601） | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
