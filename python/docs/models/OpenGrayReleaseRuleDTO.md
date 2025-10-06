# apollo_openapi.model.open_gray_release_rule_dto.OpenGrayReleaseRuleDTO

Apollo灰度发布规则数据传输对象，表示完整的灰度发布规则配置

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Apollo灰度发布规则数据传输对象，表示完整的灰度发布规则配置 |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**dataChangeCreatedBy** | str,  | str,  | 灰度规则创建者用户名，记录是谁创建了这个灰度发布规则 | [optional]
**dataChangeLastModifiedBy** | str,  | str,  | 灰度规则最后修改者用户名，记录最后一次修改规则的用户 | [optional]
**dataChangeCreatedTime** | str,  | str,  | 灰度规则创建时间，ISO 8601格式的时间戳 | [optional]
**dataChangeLastModifiedTime** | str,  | str,  | 灰度规则最后修改时间，ISO 8601格式的时间戳 | [optional]
**appId** | str,  | str,  | 所属应用的唯一标识符 | [optional]
**clusterName** | str,  | str,  | 所属集群的名称 | [optional]
**namespaceName** | str,  | str,  | 所属命名空间的名称 | [optional]
**branchName** | str,  | str,  | 灰度分支名称，标识灰度发布的分支 | [optional]
**[ruleItems](#ruleItems)** | list, tuple,  | tuple,  | 灰度发布规则项列表，包含具体的灰度规则条件 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# ruleItems

灰度发布规则项列表，包含具体的灰度规则条件

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | 灰度发布规则项列表，包含具体的灰度规则条件 |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**OpenGrayReleaseRuleItemDTO**](OpenGrayReleaseRuleItemDTO.md) | [**OpenGrayReleaseRuleItemDTO**](OpenGrayReleaseRuleItemDTO.md) | [**OpenGrayReleaseRuleItemDTO**](OpenGrayReleaseRuleItemDTO.md) |  |

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
