package com.retail.service.member.service;

import android.app.Activity;

/**
 * 会员phone服务
 */
public interface IMemberPhoneService extends IMemberWrapperService {

    /**
     * 登录会员
     */
    void startLogin(Activity context);
}
