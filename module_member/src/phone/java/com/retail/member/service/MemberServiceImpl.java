package com.retail.member.service;

import android.support.v4.app.Fragment;
import com.retail.member.ui.MemberLoginFragment;
import member.service.IMemberService;

/**
 * 会员phone服务的实现
 */
public class MemberServiceImpl extends MemberWrapServiceImpl implements IMemberService {

    @Override
    public Fragment getLoginView() {
        return new MemberLoginFragment();
    }
}
