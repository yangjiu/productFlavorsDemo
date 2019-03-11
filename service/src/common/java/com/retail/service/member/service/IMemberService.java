package com.retail.service.member.service;

import com.retail.service.member.model.IMemberInfo;

/**
 * 会员基础公用服务
 */
public interface IMemberService {

    /**
     * 根据手机号获取会员信息
     *
     * @param phone 手机号
     * @return {@link IMemberInfo}
     */
    IMemberInfo getMemberInfo(String phone);

}
