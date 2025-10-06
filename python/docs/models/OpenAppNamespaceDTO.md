# apollo_openapi.model.open_app_namespace_dto.OpenAppNamespaceDTO

Apollo应用命名空间数据传输对象，表示应用级别的命名空间配置信息

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Apollo应用命名空间数据传输对象，表示应用级别的命名空间配置信息 |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**dataChangeCreatedBy** | str,  | str,  | 命名空间创建者用户名，记录是谁创建了这个应用命名空间 | [optional]
**dataChangeLastModifiedBy** | str,  | str,  | 命名空间最后修改者用户名，记录最后一次修改命名空间信息的用户 | [optional]
**dataChangeCreatedTime** | str,  | str,  | 命名空间创建时间，ISO 8601格式的时间戳 | [optional]
**dataChangeLastModifiedTime** | str,  | str,  | 命名空间最后修改时间，ISO 8601格式的时间戳 | [optional]
**name** | str,  | str,  | 命名空间名称，在同一应用内唯一标识一个命名空间 | [optional]
**appId** | str,  | str,  | 所属应用的唯一标识符 | [optional]
**format** | str,  | str,  | 命名空间格式类型，如properties、xml、json、yml等 | [optional]
**isPublic** | bool,  | BoolClass,  | 是否为公共命名空间，公共命名空间可以被其他应用关联使用 | [optional]
**appendNamespacePrefix** | bool,  | BoolClass,  | 对于公共命名空间，是否在命名空间名称前添加前缀 | [optional] if omitted the server will use the default value of True
**comment** | str,  | str,  | 命名空间备注说明，描述命名空间的用途和包含的配置类型 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
