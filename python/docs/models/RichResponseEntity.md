# apollo_openapi.model.rich_response_entity.RichResponseEntity

A wrapper for a single response entity with code, message, and body

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | A wrapper for a single response entity with code, message, and body |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**code** | decimal.Decimal, int,  | decimal.Decimal,  | HTTP status code |
**[message](#message)** | dict, frozendict.frozendict,  | frozendict.frozendict,  | Response message (can be string or object) |
**[body](#body)** | dict, frozendict.frozendict,  | frozendict.frozendict,  | Response payload (generic type T) | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# message

Response message (can be string or object)

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Response message (can be string or object) |

# body

Response payload (generic type T)

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Response payload (generic type T) |

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
