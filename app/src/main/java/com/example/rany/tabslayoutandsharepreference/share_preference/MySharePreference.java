package com.example.rany.tabslayoutandsharepreference.share_preference;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.rany.tabslayoutandsharepreference.constant.AppConstant;

// get and set value from/to share preference
public class MySharePreference {

    public static void setPreference(Context context, int status){
        SharedPreferences preferences = context.getSharedPreferences(
                AppConstant.SCREEN_PRE, Context.MODE_PRIVATE
        );
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(AppConstant.STATUS, status);
        editor.apply();
    }

    public static int getPreference(Context context){
        SharedPreferences preferences = context.getSharedPreferences(
                AppConstant.SCREEN_PRE, Context.MODE_PRIVATE
        );
        int status = preferences.getInt(AppConstant.STATUS, 0);
        return status;
    }

}
