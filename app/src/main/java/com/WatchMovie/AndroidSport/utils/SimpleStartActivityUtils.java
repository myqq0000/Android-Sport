package com.WatchMovie.AndroidSport.utils;

import android.content.Context;
import android.content.Intent;

/**
 * 简单的跳转Activity的工具类
 * Created by WatchMovie on 17/8/12
 */
public class SimpleStartActivityUtils {
    public static void startActivity(Context context, Class<?> cls) {
        Intent intent = new Intent(context, cls);
        context.startActivity(intent);
    }
}
