# apollo_openapi.model.open_release_dto.OpenReleaseDTO

Apollo发布信息数据传输对象，表示一次配置发布的完整信息

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Apollo发布信息数据传输对象，表示一次配置发布的完整信息 |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**dataChangeCreatedBy** | str,  | str,  | 发布创建者用户名，记录是谁创建了这次发布 | [optional]
**dataChangeLastModifiedBy** | str,  | str,  | 发布最后修改者用户名，记录最后一次修改发布信息的用户 | [optional]
**dataChangeCreatedTime** | str,  | str,  | 发布创建时间，ISO 8601格式的时间戳 | [optional]
**dataChangeLastModifiedTime** | str,  | str,  | 发布最后修改时间，ISO 8601格式的时间戳 | [optional]
**id** | decimal.Decimal, int,  | decimal.Decimal,  | 发布记录的唯一标识符，系统自动生成 | [optional] value must be a 64 bit integer
**appId** | str,  | str,  | 所属应用的唯一标识符 | [optional]
**clusterName** | str,  | str,  | 所属集群的名称 | [optional]
**namespaceName** | str,  | str,  | 所属命名空间的名称 | [optional]
**name** | str,  | str,  | 发布名称，用于标识这次发布的版本或描述 | [optional]
**configurations** | [**MapString**](MapString.md) | [**MapString**](MapString.md) |  | [optional]
**comment** | str,  | str,  | 发布备注，描述本次发布的变更内容和目的 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
