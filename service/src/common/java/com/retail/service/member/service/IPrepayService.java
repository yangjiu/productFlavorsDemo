package com.retail.service.member.service;

import com.retail.service.member.model.IMemberInfo;

/**
 * 会员储值服务
 */
public interface IPrepayService {
    /**
     * 开启轮询
     */
    void startPoll();

    /**
     * 暂停轮询
     */
    void pausePoll();

    /**
     * 关闭轮询
     */
    void closePoll();

    /**
     * 储值服务信息回调
     */
    interface IPrepayServiceCallback {
        /**
         * 储值回调
         *
         * @param isPay 是否支付，true:成功，false:失败
         * @param info  会员信息
         */
        void prepaySCallback(boolean isPay, IMemberInfo info);
    }
}
