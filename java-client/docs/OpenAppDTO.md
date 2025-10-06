

# OpenAppDTO

Apollo应用信息数据传输对象，包含应用的基本信息和元数据

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataChangeCreatedBy** | **String** | 数据创建者用户名，记录是谁创建了这个应用 |  [optional] |
|**dataChangeLastModifiedBy** | **String** | 数据最后修改者用户名，记录最后一次修改应用信息的用户 |  [optional] |
|**dataChangeCreatedTime** | **String** | 数据创建时间，ISO 8601格式的时间戳 |  [optional] |
|**dataChangeLastModifiedTime** | **String** | 数据最后修改时间，ISO 8601格式的时间戳 |  [optional] |
|**name** | **String** | 应用名称，用于显示的友好名称 |  [optional] |
|**appId** | **String** | 应用唯一标识符，全局唯一的应用ID |  [optional] |
|**orgId** | **String** | 组织ID，应用所属组织的唯一标识 |  [optional] |
|**orgName** | **String** | 组织名称，应用所属组织的显示名称 |  [optional] |
|**ownerName** | **String** | 应用负责人姓名，应用的主要负责人 |  [optional] |
|**ownerEmail** | **String** | 应用负责人邮箱地址，用于接收应用相关通知 |  [optional] |
