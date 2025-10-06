# apollo_openapi.model.multi_response_entity.MultiResponseEntity

A response container holding multiple RichResponseEntity objects

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | A response container holding multiple RichResponseEntity objects |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**code** | decimal.Decimal, int,  | decimal.Decimal,  | Overall HTTP status code |
**[entities](#entities)** | list, tuple,  | tuple,  | List of rich response entities |
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# entities

List of rich response entities

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | List of rich response entities |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**RichResponseEntity**](RichResponseEntity.md) | [**RichResponseEntity**](RichResponseEntity.md) | [**RichResponseEntity**](RichResponseEntity.md) |  |

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
