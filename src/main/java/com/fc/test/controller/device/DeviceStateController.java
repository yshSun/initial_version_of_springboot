package com.fc.test.controller.device;

import com.alibaba.fastjson.JSON;
import com.fc.test.common.base.BaseService;
import com.fc.test.model.jpa.TDeviceFoundation;
import com.fc.test.model.jpa.TDeviceFoundationExample;
import com.fc.test.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Yi
 * @Date: 2019-6-18 16:26
 * @Version 1.0
 */

@RestController
@RequestMapping("DeviceStateController")
public class DeviceStateController  {
    @Autowired
    DeviceService deviceService;

    /**
     * 获取所有数据
     */
    @GetMapping(value = "/getallinfo",produces = "application/json; charset=utf-8")
    public String getAllState()
    {
        List<TDeviceFoundation> ll = new ArrayList<TDeviceFoundation>(deviceService.getAllinfo());

        return JSON.toJSONString(ll);
    }

    @PostMapping(value = "/setinfire")
    public String setinfire()
    {
        List<TDeviceFoundation> ll = new ArrayList<TDeviceFoundation>(deviceService.getAllinfo());

        return JSON.toJSONString(ll);
    }



}
