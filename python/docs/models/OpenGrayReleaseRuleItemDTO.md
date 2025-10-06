# apollo_openapi.model.open_gray_release_rule_item_dto.OpenGrayReleaseRuleItemDTO

Apollo灰度发布规则项数据传输对象，表示灰度发布的具体规则条件

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Apollo灰度发布规则项数据传输对象，表示灰度发布的具体规则条件 |

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**clientAppId** | str,  | str,  | 客户端应用ID，指定哪个应用可以获取灰度配置 | [optional]
**[clientIpList](#clientIpList)** | list, tuple,  | tuple,  | 客户端IP地址列表，指定哪些IP地址可以获取灰度配置 | [optional]
**[clientLabelList](#clientLabelList)** | list, tuple,  | tuple,  | 客户端标签列表，通过标签来识别可以获取灰度配置的客户端 | [optional]
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# clientIpList

客户端IP地址列表，指定哪些IP地址可以获取灰度配置

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | 客户端IP地址列表，指定哪些IP地址可以获取灰度配置 |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  |

# clientLabelList

客户端标签列表，通过标签来识别可以获取灰度配置的客户端

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | 客户端标签列表，通过标签来识别可以获取灰度配置的客户端 |

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  |

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
