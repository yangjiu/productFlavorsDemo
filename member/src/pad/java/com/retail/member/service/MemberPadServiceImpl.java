package com.retail.member.service;

import com.retail.service.member.service.IMemberPadService;

/**
 * 会员pad服务的实现
 */
public class MemberPadServiceImpl extends MemberWrapServiceImpl implements IMemberPadService {
    @Override
    public String getPrepayQRCode() {
        return "0123456789";
    }
}
