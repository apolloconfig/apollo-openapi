# OpenConsumerTokenDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**i64**> | Consumer Token ID | [optional]
**deleted** | Option<**bool**> | 是否已删除 | [optional][default to false]
**deleted_at** | Option<**i64**> | 删除时间戳 | [optional][default to 0]
**consumer_id** | Option<**i64**> | Consumer ID | [optional]
**token** | Option<**String**> | Consumer Token | [optional]
**rate_limit** | Option<**i32**> | 限流QPS，0表示不限流 | [optional][default to 0]
**expires** | Option<**String**> | 过期时间 | [optional]
**data_change_created_by** | Option<**String**> | 创建人 | [optional]
**data_change_created_time** | Option<**String**> | 创建时间 | [optional]
**data_change_last_modified_by** | Option<**String**> | 最后修改人 | [optional]
**data_change_last_modified_time** | Option<**String**> | 最后修改时间 | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
