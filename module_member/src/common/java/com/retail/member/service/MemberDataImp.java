package com.retail.member.service;


import com.retail.member.model.MemberInfoEx;
import member.model.MemberInfo;
import member.service.IMemberDataService;
import member.service.IMemberVerificationService;


public class MemberDataImp implements IMemberDataService {
    @Override
    public MemberInfo getMemberInfo(String phone) {
        return new MemberInfoEx(123,"张王李",8888);
    }

    @Override
    public IMemberVerificationService.IControl memberVerification(IMemberVerificationService.ICallback callback) {
        return MemberVerificationServiceImpl.getInstance().setCallback(callback);
    }
}
