

# OpenConsumerInfoDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appId** | **String** | 第三方应用ID |  [optional] |
|**name** | **String** | 第三方应用名称 |  [optional] |
|**orgId** | **String** | 部门ID |  [optional] |
|**orgName** | **String** | 部门名称 |  [optional] |
|**ownerName** | **String** | 负责人用户名 |  [optional] |
|**ownerEmail** | **String** | 负责人邮箱 |  [optional] |
|**consumerId** | **Long** | Consumer ID |  [optional] |
|**token** | **String** | Consumer Token，仅在创建或按应用查询详情时返回 |  [optional] |
|**allowCreateApplication** | **Boolean** | 是否允许该Consumer Token创建应用 |  [optional] |
|**allowManageUsers** | **Boolean** | 是否允许该Consumer Token管理用户 |  [optional] |
|**rateLimit** | **Integer** | 限流QPS，0表示不限流 |  [optional] |
