# apollo_openapi.model.namespace_release_dto.NamespaceReleaseDTO

命名空间发布请求数据传输对象，用于创建新的配置发布

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | 命名空间发布请求数据传输对象，用于创建新的配置发布 |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**releaseTitle** | str,  | str,  | 发布标题，用于标识这次发布的名称或版本号 | [optional]
**releaseComment** | str,  | str,  | 发布备注，详细描述本次发布的变更内容和目的 | [optional]
**releasedBy** | str,  | str,  | 发布操作者用户名，记录是谁执行了这次发布操作 | [optional]
**isEmergencyPublish** | bool,  | BoolClass,  | 是否为紧急发布，紧急发布可能会跳过某些审核流程 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
