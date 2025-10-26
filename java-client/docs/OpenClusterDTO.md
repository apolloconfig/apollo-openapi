

# OpenClusterDTO

Apollo集群信息数据传输对象，表示应用在特定环境下的集群配置

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataChangeCreatedBy** | **String** | 集群创建者用户名，记录是谁创建了这个集群 |  [optional] |
|**dataChangeLastModifiedBy** | **String** | 集群最后修改者用户名，记录最后一次修改集群信息的用户 |  [optional] |
|**dataChangeCreatedTime** | **String** | 集群创建时间，ISO 8601格式的时间戳 |  [optional] |
|**dataChangeLastModifiedTime** | **String** | 集群最后修改时间，ISO 8601格式的时间戳 |  [optional] |
|**name** | **String** | 集群名称，在同一应用和环境下唯一标识一个集群 |  [optional] |
|**appId** | **String** | 所属应用的唯一标识符 |  [optional] |
|**id** | **Long** | 集群的唯一标识符 |  [optional] |
|**parentClusterId** | **Long** | 父集群的ID |  [optional] |
|**comment** | **String** | 集群的备注说明 |  [optional] |
