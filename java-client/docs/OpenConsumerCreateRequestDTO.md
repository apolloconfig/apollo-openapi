

# OpenConsumerCreateRequestDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appId** | **String** | 第三方应用ID |  |
|**allowCreateApplication** | **Boolean** | 是否允许该Consumer Token创建应用 |  [optional] |
|**allowManageUsers** | **Boolean** | 是否允许该Consumer Token管理用户 |  [optional] |
|**name** | **String** | 第三方应用名称 |  |
|**orgId** | **String** | 部门ID |  |
|**orgName** | **String** | 部门名称 |  [optional] |
|**ownerName** | **String** | 负责人用户名 |  |
|**rateLimitEnabled** | **Boolean** | 是否开启限流 |  [optional] |
|**rateLimit** | **Integer** | 限流QPS，rateLimitEnabled 为 true 时必须大于 0；未开启限流时 0 表示不限流 |  [optional] |
