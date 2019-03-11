package com.retail.member.service;

import android.content.Context;
import android.widget.Toast;
import com.retail.service.member.service.IMemberPhoneService;

/**
 * 会员phone服务的实现
 */
public class MemberPhoneServiceImpl extends MemberServiceImpl implements IMemberPhoneService {

    @Override
    public void startLogin(Context context) {
        Toast.makeText(context, "正在登录会员", Toast.LENGTH_SHORT).show();
    }
}
