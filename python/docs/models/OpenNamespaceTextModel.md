# apollo_openapi.model.open_namespace_text_model.OpenNamespaceTextModel

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**appId** | str,  | str,  | 应用唯一标识 | [optional]
**env** | str,  | str,  | 环境标识 | [optional]
**clusterName** | str,  | str,  | 集群名称 | [optional]
**namespaceName** | str,  | str,  | 命名空间名称 | [optional]
**namespaceId** | decimal.Decimal, int,  | decimal.Decimal,  | 命名空间ID | [optional] value must be a 64 bit integer
**format** | str,  | str,  | 命名空间格式类型（properties/xml/json/yml等） | [optional]
**configText** | str,  | str,  | 配置内容的原始文本 | [optional]
**operator** | str,  | str,  | 操作者用户名 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
