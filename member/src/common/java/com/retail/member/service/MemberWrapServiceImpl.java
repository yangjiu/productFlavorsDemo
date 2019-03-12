package com.retail.member.service;

import com.retail.service.member.service.IMemberDataService;
import com.retail.service.member.service.IMemberViewService;
import com.retail.service.member.service.IMemberWrapperService;

/**
 * 会员公共服务的实现
 */
public class MemberWrapServiceImpl implements IMemberWrapperService {

    @Override
    public IMemberViewService getMemberViewService() {
        return new MemberViewImp();
    }

    @Override
    public IMemberDataService getMemberService() {
        return new MemberDataImp();
    }
}
