package com.hc.dao;

import com.hc.entiry.ExceptionLog;
import com.hc.param.ExceptionLogParam;

import java.util.List;

public interface ExceptionLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ExceptionLog record);

    int insertSelective(ExceptionLog record);

    ExceptionLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ExceptionLog record);

    int updateByPrimaryKey(ExceptionLog record);

    List<ExceptionLog> selectList(ExceptionLogParam param);
}