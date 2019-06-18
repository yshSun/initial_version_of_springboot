package com.fc.test.mapper.jpa;

import com.fc.test.model.jpa.TDeviceFoundation;
import com.fc.test.model.jpa.TDeviceFoundationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDeviceFoundationMapper {
    long countByExample(TDeviceFoundationExample example);

    int deleteByExample(TDeviceFoundationExample example);

    int deleteByPrimaryKey(String deviceId);

    int insert(TDeviceFoundation record);

    int insertSelective(TDeviceFoundation record);

    List<TDeviceFoundation> selectByExample(TDeviceFoundationExample example);

    TDeviceFoundation selectByPrimaryKey(String deviceId);

    int updateByExampleSelective(@Param("record") TDeviceFoundation record, @Param("example") TDeviceFoundationExample example);

    int updateByExample(@Param("record") TDeviceFoundation record, @Param("example") TDeviceFoundationExample example);

    int updateByPrimaryKeySelective(TDeviceFoundation record);

    int updateByPrimaryKey(TDeviceFoundation record);
}