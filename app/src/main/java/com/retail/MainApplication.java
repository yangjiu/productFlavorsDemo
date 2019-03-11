package com.retail;

import android.app.Application;
import com.retail.member.service.MemberServiceImpl;
import com.retail.service.member.service.IMemberService;
import com.retail.service.util.ServiceManagerFactory;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ServiceManagerFactory.getInstance().put(IMemberService.class,MemberServiceImpl.class);

    }
}
