package com.retail

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.retail.goods.GoodsUtils
import com.retail.goods.ui.GoodsActivity


import kotlinx.android.synthetic.phone.phone_activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.phone_activity_main)
        button.setOnClickListener {
            GoodsUtils.toast(this)
        }

        button1.setOnClickListener {

            startActivity(Intent(this, GoodsActivity::class.java))

        }
    }


}
