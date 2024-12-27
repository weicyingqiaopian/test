package com.hc.generate;

import com.hc.generate.SysLocation;

public interface SysLocationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLocation record);

    int insertSelective(SysLocation record);

    SysLocation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLocation record);

    int updateByPrimaryKey(SysLocation record);
}