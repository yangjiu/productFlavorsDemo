package com.retail.member.service;

import android.support.v4.app.Fragment;
import com.retail.service.member.model.MemberInfo;
import com.retail.service.member.service.IMemberDataService;
import com.retail.service.member.service.IMemberViewService;
import com.retail.service.member.service.IMemberWrapperService;

/**
 * 会员公共服务的实现
 */
public class MemberServiceImpl implements IMemberDataService, IMemberViewService, IMemberWrapperService {

    @Override
    public MemberInfo getMemberInfo(String phone) {
        return new com.retail.member.model.MemberInfo(123, "张王李", 8888);
    }

    @Override
    public Fragment LoginView() {
        return null;
    }

    @Override
    public IMemberViewService getIMemberViewService() {
        return this;
    }

    @Override
    public IMemberDataService getMemberService() {
        return this;
    }
}
