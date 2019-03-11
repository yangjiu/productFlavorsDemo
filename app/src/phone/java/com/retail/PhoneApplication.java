package com.retail;

import com.retail.member.service.MemberPhoneServiceImpl;
import com.retail.service.member.service.IMemberPhoneService;
import com.retail.service.util.ServiceManagerFactory;

public class PhoneApplication extends MainApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        ServiceManagerFactory.getInstance().put(IMemberPhoneService.class,MemberPhoneServiceImpl.class);
    }
}
