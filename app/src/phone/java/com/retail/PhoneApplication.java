package com.retail;

import com.retail.member.service.MemberPhoneServiceImpl;
import main.ServiceManagerFactory;
import member.service.IMemberPhoneService;

public class PhoneApplication extends MainApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        ServiceManagerFactory.getInstance().put(IMemberPhoneService.class,MemberPhoneServiceImpl.class);
    }
}
