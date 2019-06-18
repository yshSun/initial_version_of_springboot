package com.fc.test.model.mapModel;

import java.io.Serializable;


public class mapModel  implements Serializable {
    private static final long serialVersionUID = 1L;
    private double longitude_; // 经度
    private double Latitude_; // 维度
    private String name;
    private String info1;
    private  String info2;
    private String info3;
    private int state; //状态
    private int int1;
    private int int2;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public double getLongitude_() {
        return longitude_;
    }

    public void setLongitude_(float longitude_) {
        this.longitude_ = longitude_;
    }

    public double getLatitude_() {
        return Latitude_;
    }

    public void setLatitude_(float latitude_) {
        Latitude_ = latitude_;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo1() {
        return info1;
    }

    public void setInfo1(String info1) {
        this.info1 = info1;
    }

    public String getInfo2() {
        return info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2;
    }

    public String getInfo3() {
        return info3;
    }

    public void setInfo3(String info3) {
        this.info3 = info3;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getInt1() {
        return int1;
    }

    public void setInt1(int int1) {
        this.int1 = int1;
    }

    public int getInt2() {
        return int2;
    }

    public void setInt2(int int2) {
        this.int2 = int2;
    }

    @Override
    public String toString() {
        return "mapModel{" +
                "longitude_=" + longitude_ +
                ", Latitude_=" + Latitude_ +
                ", name='" + name + '\'' +
                ", info1='" + info1 + '\'' +
                ", info2='" + info2 + '\'' +
                ", info3='" + info3 + '\'' +
                ", state=" + state +
                ", int1=" + int1 +
                ", int2=" + int2 +
                '}';
    }

    public mapModel(double longitude_, double latitude_, String name, String info1, String info2, String info3, int state, int int1, int int2) {
        this.longitude_ = longitude_;
        Latitude_ = latitude_;
        this.name = name;
        this.info1 = info1;
        this.info2 = info2;
        this.info3 = info3;
        this.state = state;
        this.int1 = int1;
        this.int2 = int2;
    }

    public mapModel(double longitude_, double latitude_, String name, String info1, int int1) {
        this.longitude_ = longitude_;
        Latitude_ = latitude_;
        this.name = name;
        this.info1 = info1;
        this.int1 = int1;
    }
}
