package com.fc.test.model.jpa;

public class TDeviceFoundation {
    private String deviceId;

    private String stateId;

    private String deviceBelong;

    private Double deviceLocationX;

    private Double deviceLocationY;

    private String deviceUserId;

    private Integer deviceHealth;

    private Float stateTmp;

    private Float stateHum;

    private Float statePower;

    private Integer stateIsfire;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? null : deviceId.trim();
    }

    public String getStateId() {
        return stateId;
    }

    public void setStateId(String stateId) {
        this.stateId = stateId == null ? null : stateId.trim();
    }

    public String getDeviceBelong() {
        return deviceBelong;
    }

    public void setDeviceBelong(String deviceBelong) {
        this.deviceBelong = deviceBelong == null ? null : deviceBelong.trim();
    }

    public Double getDeviceLocationX() {
        return deviceLocationX;
    }

    public void setDeviceLocationX(Double deviceLocationX) {
        this.deviceLocationX = deviceLocationX;
    }

    public Double getDeviceLocationY() {
        return deviceLocationY;
    }

    public void setDeviceLocationY(Double deviceLocationY) {
        this.deviceLocationY = deviceLocationY;
    }

    public String getDeviceUserId() {
        return deviceUserId;
    }

    public void setDeviceUserId(String deviceUserId) {
        this.deviceUserId = deviceUserId == null ? null : deviceUserId.trim();
    }

    public Integer getDeviceHealth() {
        return deviceHealth;
    }

    public void setDeviceHealth(Integer deviceHealth) {
        this.deviceHealth = deviceHealth;
    }

    public Float getStateTmp() {
        return stateTmp;
    }

    public void setStateTmp(Float stateTmp) {
        this.stateTmp = stateTmp;
    }

    public Float getStateHum() {
        return stateHum;
    }

    public void setStateHum(Float stateHum) {
        this.stateHum = stateHum;
    }

    public Float getStatePower() {
        return statePower;
    }

    public void setStatePower(Float statePower) {
        this.statePower = statePower;
    }

    public Integer getStateIsfire() {
        return stateIsfire;
    }

    public void setStateIsfire(Integer stateIsfire) {
        this.stateIsfire = stateIsfire;
    }
}