# apollo_openapi.model.open_page_dto_open_instance_dto.OpenPageDTOOpenInstanceDTO

分页实例数据传输对象，用于返回分页查询的实例列表结果

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | 分页实例数据传输对象，用于返回分页查询的实例列表结果 |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**page** | decimal.Decimal, int,  | decimal.Decimal,  | 当前页码，从0开始计数 | [optional]
**size** | decimal.Decimal, int,  | decimal.Decimal,  | 每页显示的记录数量 | [optional]
**total** | decimal.Decimal, int,  | decimal.Decimal,  | 总记录数，符合查询条件的实例总数量 | [optional] value must be a 64 bit integer
**[content](#content)** | list, tuple,  | tuple,  | 当前页的实例列表，包含具体的实例数据 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# content

当前页的实例列表，包含具体的实例数据

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | 当前页的实例列表，包含具体的实例数据 |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**OpenInstanceDTO**](OpenInstanceDTO.md) | [**OpenInstanceDTO**](OpenInstanceDTO.md) | [**OpenInstanceDTO**](OpenInstanceDTO.md) |  |

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
