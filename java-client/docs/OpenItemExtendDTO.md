

# OpenItemExtendDTO

Apollo配置项扩展信息，包含状态、类型、归属及变更对比信息

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**namespaceId** | **Long** | 所属命名空间的ID |  [optional] |
|**isModified** | **Boolean** | 是否有未发布的修改 |  [optional] |
|**isDeleted** | **Boolean** | 是否被标记为删除（未发布） |  [optional] |
|**isNewlyAdded** | **Boolean** | 是否为新添加的配置项（未发布） |  [optional] |
|**newValue** | **String** | 新的值 |  [optional] |
|**oldValue** | **String** | 上一次发布的值，用于对比变更 |  [optional] |
