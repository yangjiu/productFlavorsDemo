package com.retail.service.member.service;

import com.retail.service.member.model.IMemberInfo;

/**
 * 会员验证服务
 */
@SuppressWarnings("unused")
public interface IMemberVerificationService {

    /**
     * 信息回调
     */
    interface ICallback {
        /**
         * 储值回调
         *
         * @param isPay 是否支付，true:成功，false:失败
         * @param info  会员信息
         */
        void prepaySCallback(boolean isPay, IMemberInfo info);
    }

    /**
     * 控制器
     */
    interface IControl {
        /**
         * 开启轮询
         */
        void restart();

        /**
         * 关闭轮询
         */
        void close();
    }
}
