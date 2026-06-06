# apollo_openapi.model.open_consumer_create_request_dto.OpenConsumerCreateRequestDTO

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ownerName** | str,  | str,  | 负责人用户名 | [required]
**appId** | str,  | str,  | 第三方应用ID | [required]
**name** | str,  | str,  | 第三方应用名称 | [required]
**orgId** | str,  | str,  | 部门ID | [required]
**allowCreateApplication** | bool,  | BoolClass,  | 是否允许该Consumer Token创建应用 | [optional] if omitted the server will use the default value of False
**allowManageUsers** | bool,  | BoolClass,  | 是否允许该Consumer Token管理用户 | [optional] if omitted the server will use the default value of False
**orgName** | str,  | str,  | 部门名称 | [optional]
**rateLimitEnabled** | bool,  | BoolClass,  | 是否开启限流 | [optional] if omitted the server will use the default value of False
**rateLimit** | decimal.Decimal, int,  | decimal.Decimal,  | 限流QPS，rateLimitEnabled 为 true 时必须大于 0；未开启限流时 0 表示不限流 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
