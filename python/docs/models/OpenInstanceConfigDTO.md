# apollo_openapi.model.open_instance_config_dto.OpenInstanceConfigDTO

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**release** | [**OpenReleaseDTO**](OpenReleaseDTO.md) | [**OpenReleaseDTO**](OpenReleaseDTO.md) |  | [optional]
**releaseDeliveryTime** | str,  | str,  | 配置下发时间（ISO 8601） | [optional]
**dataChangeLastModifiedTime** | str,  | str,  | 最后修改时间（ISO 8601） | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
