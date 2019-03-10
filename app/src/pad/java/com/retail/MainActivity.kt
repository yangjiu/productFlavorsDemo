package com.retail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.retail.goods.GoodsUtils
import com.retail.service.ServiceUtils
import kotlinx.android.synthetic.pad.pad_activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pad_activity_main)
        button.setOnClickListener{
            ServiceUtils.toast(this)
            GoodsUtils.toast(this)
        }
    }
}
