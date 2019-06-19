package com.fc.test.service;

import cn.hutool.core.lang.Snowflake;
import com.fc.test.mapper.workorder.AlarmWorkOrderEntityMapper;
import com.fc.test.mapper.workorder.NotificationLogEntityMapper;
import com.fc.test.model.workorder.AlarmWorkOrderEntity;
import com.fc.test.model.workorder.NotificationLogEntity;
import com.fc.test.util.NotifyPushUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ClassName WorkOrderService
 * @Author sjf
 * @mail sjf10050@outlook.com
 * @Date 2019-06-19 08:35
 * @Description 预警工单服务
 */
@Service
public class WorkOrderService {
    @Autowired
    private AlarmWorkOrderEntityMapper alarmWorkOrderEntityMapper;
    @Autowired
    private NotificationLogEntityMapper NotificationLogEntityMapper;
    @Autowired
    private NotifyPushUtil notifyPushUtil;

    private String toAddress = "573262265@qq.com";
    private String fromAddress = "18551051565@163.com";

    //预警生成工单，为指定设备Id生成工单、发送邮件报警
    public void createOrder(String deviceId) {
        if (null == deviceId || deviceId.isEmpty()) {
            return;
        }
        //根据设备号生成新工单
        AlarmWorkOrderEntity alarmWorkOrderEntity = new AlarmWorkOrderEntity();
        alarmWorkOrderEntity.setDeviceId(deviceId);
        alarmWorkOrderEntity.setOrderCreateTime(new Date());
        //状态：
        // 0：初始状态
        // 1：完成
        // 4：取消
        alarmWorkOrderEntity.setWorkingState((byte) 0);
        int orderId = alarmWorkOrderEntityMapper.insertSelective(alarmWorkOrderEntity);

        //推送邮件
        String mailPayload = "设备：" + deviceId + "发出烟雾报警";
        notifyPushUtil.pushByMail("烟雾报警", mailPayload, toAddress, fromAddress);

        //写入推送日志
        NotificationLogEntity notificationLogEntity = new NotificationLogEntity();
        notificationLogEntity.setOrderId(orderId);
        notificationLogEntity.setNotifyAddress(toAddress);
        notificationLogEntity.setPushTime(new Date());
        notificationLogEntity.setPayload(mailPayload);
        notificationLogEntity.setNotifyState((byte) 1);
        //生成随机Id
        Snowflake snowflake = new Snowflake(1, 1);
        notificationLogEntity.setNotificationId(snowflake.nextId());
        notificationLogEntity.setNotifyType((byte) 1);
        NotificationLogEntityMapper.insertSelective(notificationLogEntity);
    }

    //获取所有工单
    public List<AlarmWorkOrderEntity> getAllOrder() {

        return null;
    }

    //标记工单状态
    public void markOrder(String orderId, int newState) {

    }

    //邮件推动历史
    public List<NotificationLogEntity> getPushLog() {
        return null;
    }


}
