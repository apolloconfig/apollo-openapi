# apollo_openapi.model.open_namespace_lock_dto.OpenNamespaceLockDTO

Apollo命名空间锁状态数据传输对象

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Apollo命名空间锁状态数据传输对象 |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**namespaceName** | str,  | str,  | 命名空间名称 | [optional]
**isLocked** | bool,  | BoolClass,  | 是否被锁定 | [optional]
**lockedBy** | str,  | str,  | 锁定者用户名 | [optional]
**isEmergencyPublishAllowed** | bool,  | BoolClass,  | 是否允许紧急发布 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
