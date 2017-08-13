package com.WatchMovie.AndroidSport.model.request;

import com.WatchMovie.AndroidSport.model.entity.PostRequestBody;
import com.WatchMovie.AndroidSport.model.network.HttpClient;
import com.WatchMovie.AndroidSport.model.network.listener.OnRequestListener;
import com.WatchMovie.AndroidSport.utils.AESUtils;
import com.WatchMovie.AndroidSport.utils.HexUtils;


/**
 * Request请求的基类，封装了错误码，网络访问的方法
 * 子类需要实现HttpClient请求的回调，即获取到返回值，并根据不同的请求作出处理，在写出相应请求的回调。
 * Created by WatchMovie on 17/8/12
 */
public abstract class BaseRequest {

    private static final String HEX_KEY = "5de7e29919fad4d5a17f97a3b6215a68";
    private static final byte[] key = HexUtils.hexStringToBytes(HEX_KEY);

    private static final String DOMAIN_NAME = "47.93.222.250";
    private static final String BASE_URL = "http://"+ DOMAIN_NAME +":80/Sport/";
    private static final String REQUEST_BASE_KEY = "s";
    protected static final String RESULT_KEY = "result";

    public static final int REQUEST_SUCCESS = 0; //成功
    public static final int REQUEST_OTHER_EXCEPTION = 100; //服务器错误，请求错误等等非逻辑错误，都是这个

    public void doRequest(){
        String path = BASE_URL+getRequestPath();

        PostRequestBody body = new PostRequestBody();
        body.name = REQUEST_BASE_KEY;
        body.value = AESUtils.encrypt(key,getRequestJsonString());

        HttpClient.doAsyncPost(path,new PostRequestBody[]{body}, getRequestListener());
    }

    public String doSyncPost(){
        String path = BASE_URL+getRequestPath();

        PostRequestBody body = new PostRequestBody();
        body.name = REQUEST_BASE_KEY;
        body.value = AESUtils.encrypt(key,getRequestJsonString());

        return HttpClient.doSyncPost(path,new PostRequestBody[]{body});
    }


    /**
     * 得到HttpClient请求的回调接口
     * @return 请求回调
     */
    protected abstract OnRequestListener<String> getRequestListener();

    /**
     * 得到请求的path
     * @return
     */
    protected abstract String getRequestPath();

    /**
     * 得到封装的请求json数据
     * @return
     */
    protected abstract String getRequestJsonString();


}