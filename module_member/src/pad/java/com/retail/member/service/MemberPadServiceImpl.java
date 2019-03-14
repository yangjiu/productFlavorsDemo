package com.retail.member.service;


import member.service.IMemberPadService;
import com.retail.member.service.MemberWrapServiceImpl;

/**
 * 会员pad服务的实现
 */
public class MemberPadServiceImpl extends MemberWrapServiceImpl implements IMemberPadService {
    @Override
    public String getPrepayQRCode() {
        return "0123456789";
    }
}
