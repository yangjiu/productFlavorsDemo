package com.retail.member.service;

import com.retail.member.model.MemberInfoEx;
import com.retail.service.member.model.MemberInfo;
import com.retail.service.member.service.IMemberDataService;

public class MemberDataImp implements IMemberDataService {
    @Override
    public MemberInfo getMemberInfo(String phone) {
        return new MemberInfoEx(123,"张王李",8888);
    }
}
