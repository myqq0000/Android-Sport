package com.WatchMovie.AndroidSport;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;
import com.WatchMovie.AndroidSport.model.User;
import com.WatchMovie.AndroidSport.model.network.HttpClient;
import com.orhanobut.logger.Logger;

/**
 * 程序的Application对象
 * Created by WatchMovie on 17/8/12
 */
public class App extends Application{

    private static final String TAG_NAME = "MY_TAG";

    @Override
    public void onCreate() {
        super.onCreate();

        //可以在Application对象中初始化一些类库

        Logger.init(TAG_NAME);
        HttpClient.init(this);

        User.init(getApplicationContext());

        SDKInitializer.initialize(getApplicationContext());
    }
}
