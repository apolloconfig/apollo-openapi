# apollo_openapi.model.open_item_diff_dto.OpenItemDiffDTO

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**code** | decimal.Decimal, int,  | decimal.Decimal,  | 查找结果 | [optional]
**message** | str,  | str,  | 查找结果信息 | [optional]
**namespace** | [**OpenNamespaceIdentifier**](OpenNamespaceIdentifier.md) | [**OpenNamespaceIdentifier**](OpenNamespaceIdentifier.md) |  | [optional]
**[createItems](#createItems)** | list, tuple,  | tuple,  |  | [optional]
**[deleteItems](#deleteItems)** | list, tuple,  | tuple,  |  | [optional]
**[updateItems](#updateItems)** | list, tuple,  | tuple,  |  | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# createItems

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**OpenItemDTO**](OpenItemDTO.md) | [**OpenItemDTO**](OpenItemDTO.md) | [**OpenItemDTO**](OpenItemDTO.md) |  |

# deleteItems

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**OpenItemDTO**](OpenItemDTO.md) | [**OpenItemDTO**](OpenItemDTO.md) | [**OpenItemDTO**](OpenItemDTO.md) |  |

# updateItems

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**OpenItemDTO**](OpenItemDTO.md) | [**OpenItemDTO**](OpenItemDTO.md) | [**OpenItemDTO**](OpenItemDTO.md) |  |

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
