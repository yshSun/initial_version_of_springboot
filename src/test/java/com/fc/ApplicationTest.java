package com.fc;

import com.fc.test.service.WorkOrderService;
import com.fc.test.util.NotifyPushUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName com.fc.ApplicationTest
 * @Author sjf
 * @mail sjf10050@outlook.com
 * @Date 2019-06-19 09:13
 * @Description 应用测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {
    @Autowired
    private NotifyPushUtil notifyPushUtil;
    @Autowired
    private WorkOrderService workOrderService;

    @Test
    public void contextLoads() {
        // mqttPushClient.publish("test", "hello");
//        NotifyPushUtil notifyPushUtil = new NotifyPushUtil();
        workOrderService.createOrder("10010");
        //notifyPushUtil.pushByMail("测试邮件", "good", "573262265@qq.com", "18551051565@163.com");
    }

}
