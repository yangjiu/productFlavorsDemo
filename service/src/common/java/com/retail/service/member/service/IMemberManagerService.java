package com.retail.service.member.service;

/**
 * 会员基础公用服务
 */
public interface IMemberManagerService {

    /**
     * 获取储值服务
     *
     * @param callback 回调
     * @return {@link IPrepayService}
     */
    IPrepayService getPrepayService(IPrepayService.IPrepayServiceCallback callback);

    /**
     * 获取IMemberService
     *
     * @return {@link IMemberService}
     */
    IMemberService getMemberService();
}
