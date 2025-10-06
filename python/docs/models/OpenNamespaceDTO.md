# apollo_openapi.model.open_namespace_dto.OpenNamespaceDTO

Apollo命名空间数据传输对象，表示一个完整的命名空间及其配置项

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Apollo命名空间数据传输对象，表示一个完整的命名空间及其配置项 |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**dataChangeCreatedBy** | str,  | str,  | 命名空间创建者用户名，记录是谁创建了这个命名空间 | [optional]
**dataChangeLastModifiedBy** | str,  | str,  | 命名空间最后修改者用户名，记录最后一次修改命名空间信息的用户 | [optional]
**dataChangeCreatedTime** | str,  | str,  | 命名空间创建时间，ISO 8601格式的时间戳 | [optional]
**dataChangeLastModifiedTime** | str,  | str,  | 命名空间最后修改时间，ISO 8601格式的时间戳 | [optional]
**appId** | str,  | str,  | 所属应用的唯一标识符 | [optional]
**clusterName** | str,  | str,  | 所属集群的名称 | [optional]
**namespaceName** | str,  | str,  | 命名空间名称，在同一应用和集群下唯一标识一个命名空间 | [optional]
**comment** | str,  | str,  | 命名空间备注说明，描述命名空间的用途 | [optional]
**format** | str,  | str,  | 命名空间格式类型，如properties、xml、json、yml等 | [optional]
**isPublic** | bool,  | BoolClass,  | 是否为公共命名空间，公共命名空间可以被其他应用关联使用 | [optional]
**[items](#items)** | list, tuple,  | tuple,  | 命名空间包含的配置项列表 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# items

命名空间包含的配置项列表

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | 命名空间包含的配置项列表 |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**OpenItemDTO**](OpenItemDTO.md) | [**OpenItemDTO**](OpenItemDTO.md) | [**OpenItemDTO**](OpenItemDTO.md) |  |

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
