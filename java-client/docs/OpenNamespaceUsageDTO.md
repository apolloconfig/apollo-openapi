

# OpenNamespaceUsageDTO

命名空间使用情况数据传输对象，统计各环境和集群下的使用指标

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**namespaceName** | **String** | 命名空间名称 |  [optional] |
|**appId** | **String** | 所属应用的唯一标识符 |  [optional] |
|**clusterName** | **String** | 所属集群名称 |  [optional] |
|**envName** | **String** | 环境名称 |  [optional] |
|**instanceCount** | **Integer** | 该命名空间关联的实例数量 |  [optional] |
|**branchInstanceCount** | **Integer** | 分支命名空间关联的实例数量 |  [optional] |
|**linkedNamespaceCount** | **Integer** | 关联到该公共命名空间的命名空间数量 |  [optional] |
