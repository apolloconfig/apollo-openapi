# apollo_openapi.model.open_app_dto.OpenAppDTO

Apollo应用信息数据传输对象，包含应用的基本信息和元数据

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Apollo应用信息数据传输对象，包含应用的基本信息和元数据 |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**dataChangeCreatedBy** | str,  | str,  | 数据创建者用户名，记录是谁创建了这个应用 | [optional]
**dataChangeLastModifiedBy** | str,  | str,  | 数据最后修改者用户名，记录最后一次修改应用信息的用户 | [optional]
**dataChangeCreatedTime** | str,  | str,  | 数据创建时间，ISO 8601格式的时间戳 | [optional]
**dataChangeLastModifiedTime** | str,  | str,  | 数据最后修改时间，ISO 8601格式的时间戳 | [optional]
**name** | str,  | str,  | 应用名称，用于显示的友好名称 | [optional]
**appId** | str,  | str,  | 应用唯一标识符，全局唯一的应用ID | [optional]
**orgId** | str,  | str,  | 组织ID，应用所属组织的唯一标识 | [optional]
**orgName** | str,  | str,  | 组织名称，应用所属组织的显示名称 | [optional]
**ownerName** | str,  | str,  | 应用负责人姓名，应用的主要负责人 | [optional]
**ownerEmail** | str,  | str,  | 应用负责人邮箱地址，用于接收应用相关通知 | [optional]
**ownerDisplayName** | str,  | str,  |  | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
