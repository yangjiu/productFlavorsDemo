package com.retail.service.member.service;

import android.app.Activity;
import android.support.v4.app.Fragment;

/**
 * 会员phone服务
 */
public interface IMemberPhoneService extends IMemberWrapperService {

    /**
     * 获取会员登录view
     */
    Fragment getLoginView( );
}
