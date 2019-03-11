package com.retail;

import android.app.Application;
import com.retail.member.service.MemberPadServiceImpl;
import com.retail.member.service.MemberServiceImpl;
import com.retail.service.member.service.IMemberPadService;
import com.retail.service.member.service.IMemberService;
import com.retail.service.util.ServiceManagerFactory;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ServiceManagerFactory.getInstance().put(IMemberService.class,MemberServiceImpl.class);
        ServiceManagerFactory.getInstance().put(IMemberPadService.class,MemberPadServiceImpl.class);
    }
}
