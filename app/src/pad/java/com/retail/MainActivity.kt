package com.retail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.retail.goods.GoodsUtils
import com.retail.service.member.service.IMemberPadService
import com.retail.service.util.ServiceManagerFactory
import kotlinx.android.synthetic.pad.pad_activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pad_activity_main)
        val padService = ServiceManagerFactory.getInstance().get(IMemberPadService::class.java)

        button.setOnClickListener {
            GoodsUtils.toast(this)
        }

        button1.setOnClickListener {
            val qRCode = padService.prepayQRCode
            Toast.makeText(this, qRCode, Toast.LENGTH_LONG).show()
        }

        button2.setOnClickListener {
            val info = padService.memberService.getMemberInfo("123").toString()
            Toast.makeText(this, info, Toast.LENGTH_LONG).show()
        }
    }
}
