package com.WatchMovie.AndroidSport.model.network.listener;

/**
 * 异步请求的接口
 * Created by WatchMovie on 17/8/12
 */
public interface OnRequestListener<T>{
    void onSuccess(T t);
    void onFail();
}
