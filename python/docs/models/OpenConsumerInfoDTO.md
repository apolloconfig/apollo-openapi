# apollo_openapi.model.open_consumer_info_dto.OpenConsumerInfoDTO

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**appId** | str,  | str,  | 第三方应用ID | [optional]
**name** | str,  | str,  | 第三方应用名称 | [optional]
**orgId** | str,  | str,  | 部门ID | [optional]
**orgName** | str,  | str,  | 部门名称 | [optional]
**ownerName** | str,  | str,  | 负责人用户名 | [optional]
**ownerEmail** | str,  | str,  | 负责人邮箱 | [optional]
**consumerId** | decimal.Decimal, int,  | decimal.Decimal,  | Consumer ID | [optional] value must be a 64 bit integer
**token** | str,  | str,  | Consumer Token，仅在创建或按应用查询详情时返回 | [optional]
**allowCreateApplication** | bool,  | BoolClass,  | 是否允许该Consumer Token创建应用 | [optional] if omitted the server will use the default value of False
**allowManageUsers** | bool,  | BoolClass,  | 是否允许该Consumer Token管理用户 | [optional] if omitted the server will use the default value of False
**rateLimit** | decimal.Decimal, int,  | decimal.Decimal,  | 限流QPS，0表示不限流 | [optional] if omitted the server will use the default value of 0
**rateLimitEnabled** | bool,  | BoolClass,  | 是否开启限流 | [optional] if omitted the server will use the default value of False
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
