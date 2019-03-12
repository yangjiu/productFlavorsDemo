package com.retail.member.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.retail.member.ui.MemberLoginActivity;
import com.retail.service.member.service.IMemberPhoneService;

/**
 * 会员phone服务的实现
 */
public class MemberPhoneServiceImpl extends MemberWrapServiceImpl implements IMemberPhoneService {

    @Override
    public void startLogin(Activity context) {
        Toast.makeText(context, "正在登录会员", Toast.LENGTH_SHORT).show();
        context.startActivity(new Intent(context, MemberLoginActivity.class));
    }
}
