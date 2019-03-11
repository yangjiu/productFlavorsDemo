package com.retail.service.member.service;

/**
 * 会员pad服务
 */
public interface IMemberPadService extends IMemberService {
    /**
     * 获取储值二维码
     *
     * @return 储值二维码地址
     */
    String getPrepayQRCorde();

}
