package com.retail.goods.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.retail.goods.R;
import com.retail.service.member.service.IMemberPhoneService;
import com.retail.service.util.ServiceManagerFactory;


public class GoodsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goods_activity);

        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IMemberPhoneService service = ServiceManagerFactory.getInstance().get(IMemberPhoneService.class);
                Fragment fragment = service.getLoginView();
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).commit();
            }
        });
    }
}
