# apollo_openapi.model.open_item_dto.OpenItemDTO

Apollo配置项数据传输对象，表示一个具体的配置键值对及其元数据

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Apollo配置项数据传输对象，表示一个具体的配置键值对及其元数据 |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**dataChangeCreatedBy** | str,  | str,  | 配置项创建者用户名，记录是谁创建了这个配置项 | [optional]
**dataChangeLastModifiedBy** | str,  | str,  | 配置项最后修改者用户名，记录最后一次修改配置的用户 | [optional]
**dataChangeCreatedTime** | str,  | str,  | 配置项创建时间，ISO 8601格式的时间戳 | [optional]
**dataChangeLastModifiedTime** | str,  | str,  | 配置项最后修改时间，ISO 8601格式的时间戳 | [optional]
**key** | str,  | str,  | 配置项的键名，在同一命名空间内唯一标识一个配置项 | [optional]
**type** | decimal.Decimal, int,  | decimal.Decimal,  | 配置项类型，0表示普通配置项，1表示文件类型配置项 | [optional]
**value** | str,  | str,  | 配置项的值，可以是字符串、数字、JSON等格式 | [optional]
**comment** | str,  | str,  | 配置项的注释说明，用于描述配置项的用途和含义 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
