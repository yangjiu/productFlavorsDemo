package com.retail;

import android.app.Application;
import com.retail.member.service.MemberWrapServiceImpl;
import main.ServiceManagerFactory;
import member.service.IMemberWrapperService;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ServiceManagerFactory.getInstance().put(IMemberWrapperService.class,MemberWrapServiceImpl.class);
        ServiceManagerFactory.getInstance().put(IMemberWrapperService.class,MemberWrapServiceImpl.class);
    }
}
