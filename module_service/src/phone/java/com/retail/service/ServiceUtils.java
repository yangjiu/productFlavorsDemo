package com.retail.service;

import android.content.Context;
import android.widget.Toast;

public class ServiceUtils {
    public static void toast(Context context){
        MainServiceUtils.log("phone");
        Toast.makeText(context,"phone",Toast.LENGTH_SHORT).show();
    }
}
