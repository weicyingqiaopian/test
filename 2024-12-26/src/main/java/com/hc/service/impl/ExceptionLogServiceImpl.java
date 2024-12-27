package com.hc.service.impl;

import com.github.pagehelper.PageHelper;
import com.hc.dao.ExceptionLogMapper;
import com.hc.entiry.ExceptionLog;
import com.hc.entiry.system.CommonResult;
import com.hc.entiry.system.PageBean;
import com.hc.entiry.system.PageDto;
import com.hc.param.ExceptionLogParam;
import com.hc.service.ExceptionLogService;
import com.hc.util.PageHelperUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ExceptionLogServiceImpl implements ExceptionLogService {

    @Resource
    private ExceptionLogMapper mapper;
    @Override
    public CommonResult<PageBean<ExceptionLog>> selectList(ExceptionLogParam param) {
        PageDto pageDto = new PageDto();
        pageDto.setCurrent(1);
        pageDto.setPageSize(1);

        PageHelperUtil.pageSort(pageDto,"",false,false);
        List<ExceptionLog> list = mapper.selectList(param);
        return new CommonResult<>(new PageBean<>(list));
    }
}
