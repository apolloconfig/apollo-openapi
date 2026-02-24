# apollo_openapi.model.open_create_namespace_dto.OpenCreateNamespaceDTO

Apollo命名空间数据传输对象，表示一个完整的命名空间及其配置项

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Apollo命名空间数据传输对象，表示一个完整的命名空间及其配置项 |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**appId** | str,  | str,  | 所属应用的唯一标识符 | [optional]
**env** | str,  | str,  | 所在那个环境创建 | [optional]
**clusterName** | str,  | str,  | 所属集群的名称 | [optional]
**appNamespaceName** | str,  | str,  | 根据已创建的appnamespace来实例化namespace | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
