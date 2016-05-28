package com.dengmin.news;

import android.app.Application;
import android.content.Context;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * 设置全局AppContext
 * 初始化Fresco
 */
public class MyApplication extends Application{
    public static Context AppContext = null;

    @Override
    public void onCreate() {
        super.onCreate();
        AppContext = getApplicationContext();
        Fresco.initialize(AppContext);
    }
}
