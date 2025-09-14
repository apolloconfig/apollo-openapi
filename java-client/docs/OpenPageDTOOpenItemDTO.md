

# OpenPageDTOOpenItemDTO

分页配置项数据传输对象，用于返回分页查询的配置项列表结果

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**page** | **Integer** | 当前页码，从0开始计数 |  [optional] |
|**size** | **Integer** | 每页显示的记录数量 |  [optional] |
|**total** | **Long** | 总记录数，符合查询条件的配置项总数量 |  [optional] |
|**content** | [**List&lt;OpenItemDTO&gt;**](OpenItemDTO.md) | 当前页的配置项列表，包含具体的配置项数据 |  [optional] |



