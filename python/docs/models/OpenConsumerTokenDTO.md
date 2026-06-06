# apollo_openapi.model.open_consumer_token_dto.OpenConsumerTokenDTO

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | decimal.Decimal, int,  | decimal.Decimal,  | Consumer Token ID | [optional] value must be a 64 bit integer
**deleted** | bool,  | BoolClass,  | 是否已删除 | [optional] if omitted the server will use the default value of False
**deletedAt** | decimal.Decimal, int,  | decimal.Decimal,  | 删除时间戳 | [optional] if omitted the server will use the default value of 0value must be a 64 bit integer
**consumerId** | decimal.Decimal, int,  | decimal.Decimal,  | Consumer ID | [optional] value must be a 64 bit integer
**token** | str,  | str,  | Consumer Token | [optional]
**rateLimit** | decimal.Decimal, int,  | decimal.Decimal,  | 限流QPS，0表示不限流 | [optional] if omitted the server will use the default value of 0
**expires** | str, datetime,  | str,  | 过期时间 | [optional] value must conform to RFC-3339 date-time
**dataChangeCreatedBy** | str,  | str,  | 创建人 | [optional]
**dataChangeCreatedTime** | str, datetime,  | str,  | 创建时间 | [optional] value must conform to RFC-3339 date-time
**dataChangeLastModifiedBy** | str,  | str,  | 最后修改人 | [optional]
**dataChangeLastModifiedTime** | str, datetime,  | str,  | 最后修改时间 | [optional] value must conform to RFC-3339 date-time
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
