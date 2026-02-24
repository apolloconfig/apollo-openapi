# apollo_openapi.model.open_namespace_usage_dto.OpenNamespaceUsageDTO

命名空间使用情况数据传输对象，统计各环境和集群下的使用指标

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | 命名空间使用情况数据传输对象，统计各环境和集群下的使用指标 |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**namespaceName** | str,  | str,  | 命名空间名称 | [optional]
**appId** | str,  | str,  | 所属应用的唯一标识符 | [optional]
**clusterName** | str,  | str,  | 所属集群名称 | [optional]
**envName** | str,  | str,  | 环境名称 | [optional]
**instanceCount** | decimal.Decimal, int,  | decimal.Decimal,  | 该命名空间关联的实例数量 | [optional]
**branchInstanceCount** | decimal.Decimal, int,  | decimal.Decimal,  | 分支命名空间关联的实例数量 | [optional]
**linkedNamespaceCount** | decimal.Decimal, int,  | decimal.Decimal,  | 关联到该公共命名空间的命名空间数量 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
