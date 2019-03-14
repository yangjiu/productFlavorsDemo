package com.retail.member.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.retail.member.R;

public class MemberLoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.member_activity_login);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, new MemberLoginFragment()).commit();
    }
}
