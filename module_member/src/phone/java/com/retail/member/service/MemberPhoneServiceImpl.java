package com.retail.member.service;

import android.support.v4.app.Fragment;
import com.retail.member.ui.MemberLoginFragment;
import member.service.IMemberPhoneService;

/**
 * 会员phone服务的实现
 */
public class MemberPhoneServiceImpl extends MemberWrapServiceImpl implements IMemberPhoneService {

    @Override
    public Fragment getLoginView() {
        return new MemberLoginFragment();
    }
}
