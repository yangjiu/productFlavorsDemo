package com.retail.member.service;

import com.retail.service.member.model.IMemberInfo;
import com.retail.service.member.service.IMemberWrapperService;
import com.retail.service.member.service.IMemberService;
import com.retail.service.member.service.IMemberVerificationService;

/**
 * 会员公共服务的实现
 */
public  class MemberServiceImpl implements IMemberService ,IMemberWrapperService {

    @Override
    public IMemberInfo getMemberInfo(String phone) {
        return null;
    }

    @Override
    public IMemberVerificationService getPrepayService(IMemberVerificationService.IPrepayServiceCallback callback) {
        return null;
    }

    @Override
    public IMemberService getMemberService() {
        return this;
    }
}
