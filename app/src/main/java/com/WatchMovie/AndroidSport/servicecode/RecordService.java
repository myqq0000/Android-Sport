package com.WatchMovie.AndroidSport.servicecode;

import com.baidu.mapapi.model.LatLng;

/**
 * 上传跑步信息的Service接口
 * Created by WatchMovie on 17/8/12
 */
public interface RecordService {

    //记录运动坐标和大概描述信息
    void recordSport(LatLng latLng,String location);
}
