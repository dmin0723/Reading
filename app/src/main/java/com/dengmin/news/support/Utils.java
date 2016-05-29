package com.dengmin.news.support;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import com.dengmin.news.MyApplication;
import com.dengmin.news.R;

/**
 * utils 汇总
 */
public class Utils {
    private static boolean DEBUG = true;
    private static Context mContext = MyApplication.AppContext;

    public static boolean hasString(String str){
        if(str == null || str.equals("")){
            return false;
        }
        return true;
    }

    public static void DLog(String text){
        if(DEBUG){
            Log.d(mContext.getString(R.string.text_debug_data),text);
        }
    }

    public static String getVersion(){

        try {
            PackageManager manager = mContext.getPackageManager();
            PackageInfo info = manager.getPackageInfo(mContext.getPackageName(),0);
            String version = info.versionName;
            return version;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
