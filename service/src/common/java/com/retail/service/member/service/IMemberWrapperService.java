package com.retail.service.member.service;

/**
 * 会员服务包装
 */
public interface IMemberWrapperService {

    /**
     * 会员验证服务
     *
     * @param callback 回调
     * @return {@link IMemberVerificationService}
     */
    IMemberVerificationService.IControl getPrepayService(IMemberVerificationService.ICallback callback);

    /**
     * 会员公用服务
     *
     * @return {@link IMemberService}
     */
    IMemberService getMemberService();
}
