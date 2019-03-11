package com.retail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.retail.goods.GoodsUtils
import com.retail.service.member.service.IMemberPhoneService
import com.retail.service.util.ServiceManagerFactory
import kotlinx.android.synthetic.phone.phone_activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.phone_activity_main)
        button.setOnClickListener {
            GoodsUtils.toast(this)
        }

        button1.setOnClickListener {
            val memberService = ServiceManagerFactory.getInstance().get(IMemberPhoneService::class.java)
            memberService.startLogin(this)
        }
    }


}
