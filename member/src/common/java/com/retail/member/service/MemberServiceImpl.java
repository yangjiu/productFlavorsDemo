package com.retail.member.service;

import com.retail.service.member.model.IMemberInfo;
import com.retail.service.member.model.IPrepayService;
import com.retail.service.member.service.IMemberService;

/**
 * 会员公共服务的实现
 */
public abstract class MemberServiceImpl implements IMemberService {

    @Override
    public IMemberInfo getMemberInfo(String phone) {
        return null;
    }

    @Override
    public IPrepayService getPrepayService(IPrepayService.IPrepayServiceCallback callback) {
        return null;
    }
}
