package com.retail;

import com.retail.member.service.MemberServiceImpl;
import main.ServiceManagerFactory;
import member.service.IMemberService;

public class PhoneApplication extends MainApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        ServiceManagerFactory.getInstance().put(IMemberService.class, MemberServiceImpl.class);
    }
}
