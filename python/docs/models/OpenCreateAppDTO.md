# apollo_openapi.model.open_create_app_dto.OpenCreateAppDTO

创建Apollo应用的请求数据传输对象，包含创建应用所需的所有信息

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | 创建Apollo应用的请求数据传输对象，包含创建应用所需的所有信息 |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**assignAppRoleToSelf** | bool,  | BoolClass,  | 是否将应用角色分配给当前用户。当设置为true时，当前token用户将获得该应用的完全操作权限 | [optional]
**[admins](#admins)** | list, tuple,  | tuple,  | 应用管理员用户名列表。应用负责人默认具有项目管理员权限。管理员可以创建命名空间、集群并分配用户权限 | [optional]
**app** | [**OpenAppDTO**](OpenAppDTO.md) | [**OpenAppDTO**](OpenAppDTO.md) |  | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# admins

应用管理员用户名列表。应用负责人默认具有项目管理员权限。管理员可以创建命名空间、集群并分配用户权限

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | 应用管理员用户名列表。应用负责人默认具有项目管理员权限。管理员可以创建命名空间、集群并分配用户权限 |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  |

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
