package com.WatchMovie.AndroidSport.activity;

import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

/**
 * 项目中所有Activity的基类
 * Created by WatchMovie on 17/8/12
 */
public class BaseActivity extends FragmentActivity{

    protected void showToast(String toast){
        Toast.makeText(this,toast,Toast.LENGTH_LONG).show();
    }

}