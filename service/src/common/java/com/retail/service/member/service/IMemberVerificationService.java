package com.retail.service.member.service;

import com.retail.service.member.model.MemberInfo;

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
         * @param info 会员信息
         */
        void prepaySCallback(boolean isSucceed, MemberInfo info);
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
         * 暂停轮询
         */
        void pause();
    }
}
