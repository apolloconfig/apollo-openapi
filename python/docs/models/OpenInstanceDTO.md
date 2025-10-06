# apollo_openapi.model.open_instance_dto.OpenInstanceDTO

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | decimal.Decimal, int,  | decimal.Decimal,  | 实例ID | [optional] value must be a 64 bit integer
**appId** | str,  | str,  | 实例所属应用ID | [optional]
**clusterName** | str,  | str,  | 实例所属集群名称 | [optional]
**dataCenter** | str,  | str,  | 数据中心/机房标识 | [optional]
**ip** | str,  | str,  | 实例IP地址 | [optional]
**[configs](#configs)** | list, tuple,  | tuple,  | 实例当前生效的配置列表 | [optional]
**dataChangeCreatedTime** | str,  | str,  | 数据创建时间（ISO 8601） | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# configs

实例当前生效的配置列表

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | 实例当前生效的配置列表 |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**OpenInstanceConfigDTO**](OpenInstanceConfigDTO.md) | [**OpenInstanceConfigDTO**](OpenInstanceConfigDTO.md) | [**OpenInstanceConfigDTO**](OpenInstanceConfigDTO.md) |  |

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
