package com.retail;

import com.retail.member.service.MemberPadServiceImpl;
import main.ServiceManagerFactory;
import member.service.IMemberPadService;

public class PadApplication extends MainApplication {
    @Override
    public void onCreate() {
        super.onCreate();

        ServiceManagerFactory.getInstance().put(IMemberPadService.class,MemberPadServiceImpl.class);
    }
}
