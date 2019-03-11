package com.retail.service.member.service;

/**
 * 会员服务包装
 */
public interface IMemberWrapperService {

    /**
     * 获取储值服务
     *
     * @param callback 回调
     * @return {@link IMemberVerificationService}
     */
    IMemberVerificationService getPrepayService(IMemberVerificationService.IPrepayServiceCallback callback);

    /**
     * 获取IMemberService
     *
     * @return {@link IMemberService}
     */
    IMemberService getMemberService();
}
