package com.fc.test.service;

import com.fc.test.common.base.BaseService;
import com.fc.test.mapper.jpa.TDeviceFoundationMapper;
import com.fc.test.model.auto.TsysUser;
import com.fc.test.model.auto.TsysUserExample;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.jpa.TDeviceFoundation;
import com.fc.test.model.jpa.TDeviceFoundationExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Yi
 * @Date: 2019-6-17 20:56
 * @Version 1.0
 */
@Service
public class DeviceService implements BaseService<TDeviceFoundation,TDeviceFoundationExample> {

    @Autowired
    private TDeviceFoundationMapper tDeviceFoundationMapper;


    /**
     * 分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<TDeviceFoundation> list(Tablepar tablepar, String belongname){
        TDeviceFoundationExample testExample=new TDeviceFoundationExample();
        testExample.setOrderByClause("device_id ASC");
        if(belongname!=null&&!"".equals(belongname)){
            testExample.createCriteria().andDeviceBelongLike("%"+belongname+"%");
//            testExample.createCriteria().andUsernameLike("%"+username+"%");
        }

        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
        List<TDeviceFoundation> list= tDeviceFoundationMapper.selectByExample(testExample);
        PageInfo<TDeviceFoundation> pageInfo = new PageInfo<TDeviceFoundation>(list);
        return  pageInfo;
    }




    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insertSelective(TDeviceFoundation record) {
        return 0;
    }

    @Override
    public TDeviceFoundation selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(TDeviceFoundation record) {
        return 0;
    }

    @Override
    public int updateByExampleSelective(TDeviceFoundation record, TDeviceFoundationExample example) {
        return 0;
    }

    @Override
    public int updateByExample(TDeviceFoundation record, TDeviceFoundationExample example) {
        return 0;
    }

    @Override
    public List<TDeviceFoundation> selectByExample(TDeviceFoundationExample example) {
        return null;
    }

    @Override
    public long countByExample(TDeviceFoundationExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(TDeviceFoundationExample example) {
        return 0;
    }
}
