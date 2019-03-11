package com.retail.service.member.service;

import android.support.v4.app.Fragment;
import com.retail.service.member.model.IMemberInfo;

/**
 * 会员通用抽象服务
 */
public interface IMemberService extends IMemberBaseService {
    /**
     * 获取会员登录view
     *
     * @return {@link Fragment}
     */
    Fragment getMemberLoginView();


}
