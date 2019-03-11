package com.retail.service.goods.model;

/**
 * 商品实体对象
 */
public interface IGoodsData {
    /**
     * 商品id
     */
    long getId();

    /**
     * 商品名称
     */
    String getName();

    /**
     * 商品价格
     */
    Long getPrice();
}
