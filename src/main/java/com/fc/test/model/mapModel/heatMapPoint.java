package com.fc.test.model.mapModel;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

public class heatMapPoint implements Serializable {
    private static final long serialVersionUID = 1L;
    @JSONField(name = "longitude_")
    private double lng; // 经度

    @JSONField(name = "lat")
    private double lat; // 维度

    @JSONField(name = "tmp")
    private float count; //温度

    public heatMapPoint(double lng, double lat, float count) {
        this.lng = lng;
        this.lat = lat;
        this.count = count;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public float getCount() {
        return count;
    }

    public void setCount(float count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "heatMapPoint{" +
                "lng=" + lng +
                ", lat=" + lat +
                ", count=" + count +
                '}';
    }
}

