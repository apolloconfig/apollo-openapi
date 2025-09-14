

# OpenGrayReleaseRuleItemDTO

Apollo灰度发布规则项数据传输对象，表示灰度发布的具体规则条件

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientAppId** | **String** | 客户端应用ID，指定哪个应用可以获取灰度配置 |  [optional] |
|**clientIpList** | **List&lt;String&gt;** | 客户端IP地址列表，指定哪些IP地址可以获取灰度配置 |  [optional] |
|**clientLabelList** | **List&lt;String&gt;** | 客户端标签列表，通过标签来识别可以获取灰度配置的客户端 |  [optional] |



