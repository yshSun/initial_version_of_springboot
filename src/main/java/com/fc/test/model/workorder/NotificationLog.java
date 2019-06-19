package com.fc.test.model.workorder;

import java.util.Date;

public class NotificationLog {
    private Long notificationId;

    private Integer orderId;

    private Byte notifyType;

    private String payload;

    private String notifyAddress;

    private String notifyState;

    private Date pushTime;

    public Long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Byte getNotifyType() {
        return notifyType;
    }

    public void setNotifyType(Byte notifyType) {
        this.notifyType = notifyType;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload == null ? null : payload.trim();
    }

    public String getNotifyAddress() {
        return notifyAddress;
    }

    public void setNotifyAddress(String notifyAddress) {
        this.notifyAddress = notifyAddress == null ? null : notifyAddress.trim();
    }

    public String getNotifyState() {
        return notifyState;
    }

    public void setNotifyState(String notifyState) {
        this.notifyState = notifyState == null ? null : notifyState.trim();
    }

    public Date getPushTime() {
        return pushTime;
    }

    public void setPushTime(Date pushTime) {
        this.pushTime = pushTime;
    }
}