package com.retail.service.member.service;

import com.retail.service.member.model.MemberInfo;

/**
 * 会员数据服务
 */
public interface IMemberDataService {

    /**
     * 根据手机号获取会员信息
     *
     * @param phone 手机号
     * @return {@link MemberInfo}
     */
    MemberInfo getMemberInfo(String phone);


    /**
     * 会员验证
     * @param callback 回调验证信息
     * @return 控制器
     */
    IMemberVerificationService.IControl memberVerification(IMemberVerificationService.ICallback callback);

}
