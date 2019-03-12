package com.retail;

import android.app.Application;
import com.retail.member.service.MemberPadServiceImpl;
import com.retail.service.member.service.IMemberPadService;
import com.retail.service.util.ServiceManagerFactory;

public class PadApplication extends MainApplication {
    @Override
    public void onCreate() {
        super.onCreate();

        ServiceManagerFactory.getInstance().put(IMemberPadService.class,MemberPadServiceImpl.class);
    }
}
