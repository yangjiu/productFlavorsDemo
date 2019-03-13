package com.retail.pad

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.retail.R
import com.retail.goods.GoodsUtils
import com.retail.service.member.service.IMemberPadService
import com.retail.service.member.service.IMemberVerificationService
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
            Toast.makeText(this, qRCode, Toast.LENGTH_SHORT).show()
            Log.e("verification", "二维码：$qRCode")
        }

        button2.setOnClickListener {
            val info = padService.memberService.getMemberInfo("17605889789")
            Toast.makeText(this, info.name, Toast.LENGTH_SHORT).show()
            Log.e("verification", "二维码：$info")

        }
        var control: IMemberVerificationService.IControl? = null

        verification.setOnClickListener {
            control = padService.memberService.memberVerification { isSucceed, info ->
                Log.e("verification", "$isSucceed---${info.toString()}")
            }
        }
        restart.setOnClickListener {
            control?.restart()
            Log.e("verification", "重新开始")
        }
        pause.setOnClickListener {
            control?.pause()
            Log.e("verification", "暂停")
        }

    }
}
