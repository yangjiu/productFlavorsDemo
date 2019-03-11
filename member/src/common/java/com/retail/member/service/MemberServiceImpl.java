package com.retail.member.service;

import com.retail.service.member.model.IMemberInfo;
import com.retail.service.member.service.IMemberService;
import com.retail.service.member.service.IPrepayService;

/**
 * 会员公共服务的实现
 */
public  class MemberServiceImpl implements IMemberService {

    @Override
    public IMemberInfo getMemberInfo(String phone) {
        return null;
    }

    @Override
    public IPrepayService getPrepayService(IPrepayService.IPrepayServiceCallback callback) {
        return null;
    }
}
