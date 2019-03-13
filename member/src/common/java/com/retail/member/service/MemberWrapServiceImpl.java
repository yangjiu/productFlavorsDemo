package com.retail.member.service;


import member.service.IMemberDataService;
import member.service.IMemberViewService;
import member.service.IMemberWrapperService;

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
