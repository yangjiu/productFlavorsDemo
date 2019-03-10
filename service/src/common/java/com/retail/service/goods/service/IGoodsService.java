package com.retail.service.goods.service;

import com.retail.service.goods.model.IGoodsData;

import java.util.List;

/**
 * 商品服务
 */
public interface IGoodsService {
    /**
     * 根据商品 id 查询商品
     *
     * @param goodsId 商品
     * @return 商品模型
     */
    IGoodsData queryGoods(long goodsId);

    /**
     * 根据商品 id 查询商品
     *
     * @param goodsIds 商品id数组
     * @return 商品模型集合
     */
    List<IGoodsData> queryGoods(long[] goodsIds);


}