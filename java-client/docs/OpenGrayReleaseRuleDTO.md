

# OpenGrayReleaseRuleDTO

Apollo灰度发布规则数据传输对象，表示完整的灰度发布规则配置

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataChangeCreatedBy** | **String** | 灰度规则创建者用户名，记录是谁创建了这个灰度发布规则 |  [optional] |
|**dataChangeLastModifiedBy** | **String** | 灰度规则最后修改者用户名，记录最后一次修改规则的用户 |  [optional] |
|**dataChangeCreatedTime** | **String** | 灰度规则创建时间，ISO 8601格式的时间戳 |  [optional] |
|**dataChangeLastModifiedTime** | **String** | 灰度规则最后修改时间，ISO 8601格式的时间戳 |  [optional] |
|**appId** | **String** | 所属应用的唯一标识符 |  [optional] |
|**clusterName** | **String** | 所属集群的名称 |  [optional] |
|**namespaceName** | **String** | 所属命名空间的名称 |  [optional] |
|**branchName** | **String** | 灰度分支名称，标识灰度发布的分支 |  [optional] |
|**ruleItems** | [**Set&lt;OpenGrayReleaseRuleItemDTO&gt;**](OpenGrayReleaseRuleItemDTO.md) | 灰度发布规则项列表，包含具体的灰度规则条件 |  [optional] |
