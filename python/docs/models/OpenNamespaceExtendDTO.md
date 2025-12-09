# apollo_openapi.model.open_namespace_extend_dto.OpenNamespaceExtendDTO

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**isConfigHidden** | bool,  | BoolClass,  | 当当前用户无权限查看配置时置为 true | [optional]
**parentAppId** | str,  | str,  | 公共命名空间的归属应用 AppId，用于判断是否关联公共 namespace 并提供跳转 | [optional]
**itemModifiedCnt** | decimal.Decimal, int,  | decimal.Decimal,  | 未发布变更数 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
