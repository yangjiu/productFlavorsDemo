package goods.service;

import android.support.v4.app.Fragment;

/**
 * 商品服务
 */
public interface IGoodsService extends IGoodsMainService {
    /**
     * 选择多单位选择fragment
     *
     * @return 单位选择ui
     */
    Fragment getUnitSelectFragment();
}
