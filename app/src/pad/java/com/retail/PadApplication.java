package com.retail;

import com.retail.member.service.MemberPadServiceImpl;
import main.ServiceManagerFactory;
import member.service.IMemberService;

public class PadApplication extends MainApplication {
    @Override
    public void onCreate() {
        super.onCreate();

        ServiceManagerFactory.getInstance().put(IMemberService.class,MemberPadServiceImpl.class);
    }
}
