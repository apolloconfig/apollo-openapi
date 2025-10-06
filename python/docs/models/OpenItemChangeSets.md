# apollo_openapi.model.open_item_change_sets.OpenItemChangeSets

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**dataChangeCreatedBy** | str,  | str,  | 变更集合创建者用户名 | [optional]
**dataChangeLastModifiedBy** | str,  | str,  | 变更集合最后修改者用户名 | [optional]
**dataChangeCreatedByDisplayName** | str,  | str,  | 创建者显示名 | [optional]
**dataChangeLastModifiedByDisplayName** | str,  | str,  | 最后修改者显示名 | [optional]
**dataChangeCreatedTime** | str,  | str,  | 变更集合创建时间（ISO 8601） | [optional]
**dataChangeLastModifiedTime** | str,  | str,  | 变更集合最后修改时间（ISO 8601） | [optional]
**[createItems](#createItems)** | list, tuple,  | tuple,  | 待创建的配置项列表 | [optional]
**[updateItems](#updateItems)** | list, tuple,  | tuple,  | 待更新的配置项列表 | [optional]
**[deleteItems](#deleteItems)** | list, tuple,  | tuple,  | 待删除的配置项列表 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# createItems

待创建的配置项列表

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | 待创建的配置项列表 |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**OpenItemDTO**](OpenItemDTO.md) | [**OpenItemDTO**](OpenItemDTO.md) | [**OpenItemDTO**](OpenItemDTO.md) |  |

# updateItems

待更新的配置项列表

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | 待更新的配置项列表 |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**OpenItemDTO**](OpenItemDTO.md) | [**OpenItemDTO**](OpenItemDTO.md) | [**OpenItemDTO**](OpenItemDTO.md) |  |

# deleteItems

待删除的配置项列表

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | 待删除的配置项列表 |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**OpenItemDTO**](OpenItemDTO.md) | [**OpenItemDTO**](OpenItemDTO.md) | [**OpenItemDTO**](OpenItemDTO.md) |  |

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
