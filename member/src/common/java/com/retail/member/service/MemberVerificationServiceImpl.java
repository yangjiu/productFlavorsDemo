package com.retail.member.service;

import android.os.Handler;
import com.retail.member.model.MemberInfoEx;
import com.retail.service.member.service.IMemberVerificationService;

/**
 * 会员公共服务的实现
 */
public class MemberVerificationServiceImpl implements IMemberVerificationService.IControl {
    private static MemberVerificationServiceImpl memberVerificationService;

    private MemberVerificationServiceImpl() {
        if (memberVerificationService == null) {
            memberVerificationService = new MemberVerificationServiceImpl();
            handler = new Handler();
        }
    }

    public synchronized static MemberVerificationServiceImpl getInstance() {
        return memberVerificationService;

    }

    private Handler handler;
    private boolean isLoop;
    private int count = 0;
    private IMemberVerificationService.ICallback callback;

    public MemberVerificationServiceImpl setCallback(final IMemberVerificationService.ICallback callback) {
        this.callback = callback;
        isLoop = true;
        loop();
        return this;
    }

    private void loop() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (callback != null) {
                    callback.prepaySCallback(false,new MemberInfoEx(count, "***", count));
                    if (isLoop) {
                        loop();
                    }
                }
            }
        }, 1000);
    }

    @Override
    public void restart() {
        isLoop = true;
        loop();
    }

    @Override
    public void pause() {
        isLoop = false;
    }
}
