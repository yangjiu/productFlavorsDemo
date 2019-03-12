package com.retail;

import android.app.Application;
import com.retail.member.service.MemberWrapServiceImpl;
import com.retail.service.member.service.IMemberWrapperService;
import com.retail.service.util.ServiceManagerFactory;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ServiceManagerFactory.getInstance().put(IMemberWrapperService.class,MemberWrapServiceImpl.class);
    }
}
