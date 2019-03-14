package com.retail.goods;

import android.content.Context;
import android.widget.Toast;
import com.retail.goos.MainGoodsUtils;

public class GoodsUtils {
    public static void toast(Context context) {
        Toast.makeText(context, "Phone", Toast.LENGTH_SHORT).show();
        MainGoodsUtils.log("phone-goods");
    }
}
