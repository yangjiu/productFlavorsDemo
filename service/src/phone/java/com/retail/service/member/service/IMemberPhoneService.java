package com.retail.service.member.service;

import android.content.Context;

/**
 * 会员phone服务
 */
public interface IMemberPhoneService extends IMemberWrapperService {

    /**
     * 登录会员
     */
    void startLogin(Context context);
}
