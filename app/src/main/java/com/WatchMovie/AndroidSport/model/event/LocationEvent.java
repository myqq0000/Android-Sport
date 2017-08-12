package com.WatchMovie.AndroidSport.model.event;

import com.baidu.mapapi.model.LatLng;

/**
 * 定位的Event
 * Created by WatchMovie on 17/8/12
 */
public class LocationEvent {

    private LatLng location;

    public LocationEvent(LatLng location) {
        this.location = location;
    }

    public LatLng getLocation() {
        return location;
    }

}
