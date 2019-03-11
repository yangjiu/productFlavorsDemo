package com.retail.member.service;

import android.support.v4.app.Fragment;
import com.retail.service.member.service.IMemberPadService;
import com.retail.service.member.service.IMemberService;

/**
 * 会员pad服务的实现
 */
public class MemberPadServiceImpl   implements IMemberPadService {



    @Override
    public String getPrepayQRCode() {
        return null;
    }

    @Override
    public IMemberService getMemberService() {
        return new MemberServiceImpl();
    }
}
