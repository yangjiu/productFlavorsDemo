package com.retail.service;

import android.content.Context;
import android.widget.Toast;

public class ServiceUtils {
    public static void toast(Context context){
        MainServiceUtils.log("pad");
        Toast.makeText(context,"pad",Toast.LENGTH_SHORT).show();
    }
}
