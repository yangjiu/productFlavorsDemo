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
}
