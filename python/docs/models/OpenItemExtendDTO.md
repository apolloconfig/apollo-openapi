# apollo_openapi.model.open_item_extend_dto.OpenItemExtendDTO

Apollo配置项扩展信息，包含状态、类型、归属及变更对比信息

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Apollo配置项扩展信息，包含状态、类型、归属及变更对比信息 |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**namespaceId** | decimal.Decimal, int,  | decimal.Decimal,  | 所属命名空间的ID | [optional] value must be a 64 bit integer
**isModified** | bool,  | BoolClass,  | 是否有未发布的修改 | [optional]
**isDeleted** | bool,  | BoolClass,  | 是否被标记为删除（未发布） | [optional]
**isNewlyAdded** | bool,  | BoolClass,  | 是否为新添加的配置项（未发布） | [optional]
**newValue** | str,  | str,  | 新的值 | [optional]
**oldValue** | str,  | str,  | 上一次发布的值，用于对比变更 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
