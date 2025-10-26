# apollo_openapi.model.open_cluster_dto.OpenClusterDTO

Apollo集群信息数据传输对象，表示应用在特定环境下的集群配置

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Apollo集群信息数据传输对象，表示应用在特定环境下的集群配置 |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**dataChangeCreatedBy** | str,  | str,  | 集群创建者用户名，记录是谁创建了这个集群 | [optional]
**dataChangeLastModifiedBy** | str,  | str,  | 集群最后修改者用户名，记录最后一次修改集群信息的用户 | [optional]
**dataChangeCreatedTime** | str,  | str,  | 集群创建时间，ISO 8601格式的时间戳 | [optional]
**dataChangeLastModifiedTime** | str,  | str,  | 集群最后修改时间，ISO 8601格式的时间戳 | [optional]
**name** | str,  | str,  | 集群名称，在同一应用和环境下唯一标识一个集群 | [optional]
**appId** | str,  | str,  | 所属应用的唯一标识符 | [optional]
**id** | decimal.Decimal, int,  | decimal.Decimal,  | 集群的唯一标识符 | [optional] value must be a 64 bit integer
**parentClusterId** | decimal.Decimal, int,  | decimal.Decimal,  | 父集群的ID | [optional] value must be a 64 bit integer
**comment** | str,  | str,  | 集群的备注说明 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
