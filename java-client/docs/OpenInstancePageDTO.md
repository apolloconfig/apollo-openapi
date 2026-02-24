

# OpenInstancePageDTO

分页实例数据传输对象，用于返回分页查询的实例列表结果

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**page** | **Integer** | 当前页码，从0开始计数 |  [optional] |
|**size** | **Integer** | 每页显示的记录数量 |  [optional] |
|**total** | **Long** | 总记录数，符合查询条件的实例总数量 |  [optional] |
|**instances** | [**List&lt;OpenInstanceDTO&gt;**](OpenInstanceDTO.md) | 当前页的实例列表，包含具体的实例数据 |  [optional] |
