package com.retail.service.member.service;

/**
 * 会员pad服务
 */
public interface IMemberPadService {
    /**
     * 获取IMemberService
     *
     * @return {@link IMemberService}
     */
    IMemberService getMemberService();

    /**
     * 获取储值二维码
     *
     * @return 储值二维码地址
     */
    String getPrepayQRCode();
}
