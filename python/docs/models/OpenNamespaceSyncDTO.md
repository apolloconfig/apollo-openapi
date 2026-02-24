# apollo_openapi.model.open_namespace_sync_dto.OpenNamespaceSyncDTO

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[syncToNamespaces](#syncToNamespaces)** | list, tuple,  | tuple,  | 目标命名空间标识列表 | [optional]
**[syncItems](#syncItems)** | list, tuple,  | tuple,  | 需要修改的配置项列表 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# syncToNamespaces

目标命名空间标识列表

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | 目标命名空间标识列表 |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**OpenNamespaceIdentifier**](OpenNamespaceIdentifier.md) | [**OpenNamespaceIdentifier**](OpenNamespaceIdentifier.md) | [**OpenNamespaceIdentifier**](OpenNamespaceIdentifier.md) |  |

# syncItems

需要修改的配置项列表

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | 需要修改的配置项列表 |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**OpenItemDTO**](OpenItemDTO.md) | [**OpenItemDTO**](OpenItemDTO.md) | [**OpenItemDTO**](OpenItemDTO.md) |  |

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
