package com.retail.member.service;

import android.support.v4.app.Fragment;
import com.retail.service.member.model.IMemberInfo;
import com.retail.service.member.model.IPrepayService;
import com.retail.service.member.service.IMemberPadService;
import com.retail.service.member.service.IMemberService;

/**
 * 会员pad服务的实现
 */
public class MemberPadServiceImpl extends MemberServiceImpl implements IMemberPadService {

    @Override
    public Fragment getMemberLoginView() {
        return null;
    }

    @Override
    public String getPrepayQRCorde() {
        return null;
    }
}
