package com.retail.goods;

import android.support.v4.app.Fragment;
import com.retail.goos.GoodsServiceImpl;
import goods.service.IGoodsService;

/**
 * 商品pad服务的实现
 */
public class GoodsPadServiceImpl extends GoodsServiceImpl implements IGoodsService {
    @Override
    public Fragment getUnitSelectFragment() {
        return null;
    }
}
