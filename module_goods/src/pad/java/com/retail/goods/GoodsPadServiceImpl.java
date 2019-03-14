package com.retail.goods;

import android.support.v4.app.Fragment;
import com.retail.goos.GoodsServiceImpl;
import goods.model.GoodsData;
import goods.service.IGoodsPadService;
import goods.service.IGoodsService;

import java.util.List;
/**
 * 商品pad服务的实现
 */
public class GoodsPadServiceImpl extends GoodsServiceImpl implements IGoodsPadService {
    @Override
    public Fragment getUnitSelectFragment() {
        return null;
    }
}
