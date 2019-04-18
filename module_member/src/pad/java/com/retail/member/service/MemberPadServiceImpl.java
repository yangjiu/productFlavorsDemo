package com.retail.member.service;


import member.service.IMemberService;

/**
 * 会员pad服务的实现
 */
public class MemberPadServiceImpl extends MemberWrapServiceImpl implements IMemberService {
    @Override
    public String getPrepayQRCode() {
        return "0123456789";
    }
}
