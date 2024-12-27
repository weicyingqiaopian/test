package com.hc.service;

import com.hc.entiry.ExceptionLog;
import com.hc.entiry.system.CommonResult;
import com.hc.entiry.system.PageBean;
import com.hc.param.ExceptionLogParam;

public interface ExceptionLogService {
    CommonResult<PageBean<ExceptionLog>> selectList(ExceptionLogParam param);
}
