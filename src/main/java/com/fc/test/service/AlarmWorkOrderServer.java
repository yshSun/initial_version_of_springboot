package com.fc.test.service;

import com.fc.test.common.base.BaseService;

import com.fc.test.mapper.workorder.AlarmworkOrderMapper;
import com.fc.test.model.custom.Tablepar;
import com.fc.test.model.workorder.AlarmworkOrder;
import com.fc.test.model.workorder.AlarmworkOrderExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Yi
 * @Date: 2019-6-18 20:52
 * @Version 1.0
 */
@Service
public class AlarmWorkOrderServer implements BaseService<AlarmworkOrder,AlarmworkOrderExample> {

    @Autowired
    private AlarmworkOrderMapper alarmworkOrderMapper;

    public PageInfo<AlarmworkOrder> list(Tablepar tablepar, String belongname){
        AlarmworkOrderExample alarmworkOrderExample=new AlarmworkOrderExample();
        alarmworkOrderExample.setOrderByClause("device_id ASC");
        if(belongname!=null&&!"".equals(belongname)){
            alarmworkOrderExample.createCriteria().andGroupIdLike("%"+belongname+"%");
//            testExample.createCriteria().andUsernameLike("%"+username+"%");
        }

        PageHelper.startPage(tablepar.getPageNum(), tablepar.getPageSize());
        List<AlarmworkOrder> list= alarmworkOrderMapper.selectByExample(alarmworkOrderExample);
        PageInfo<AlarmworkOrder> pageInfo = new PageInfo<AlarmworkOrder>(list);
        return  pageInfo;
    }





    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insertSelective(AlarmworkOrder record) {
        return 0;
    }

    @Override
    public AlarmworkOrder selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(AlarmworkOrder record) {
        return 0;
    }

    @Override
    public int updateByExampleSelective(AlarmworkOrder record, AlarmworkOrderExample example) {
        return 0;
    }

    @Override
    public int updateByExample(AlarmworkOrder record, AlarmworkOrderExample example) {
        return 0;
    }

    @Override
    public List<AlarmworkOrder> selectByExample(AlarmworkOrderExample example) {
        return null;
    }

    @Override
    public long countByExample(AlarmworkOrderExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(AlarmworkOrderExample example) {
        return 0;
    }
}
