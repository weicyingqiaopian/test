package com.hc.controller;

import com.hc.entiry.ExceptionLog;
import com.hc.entiry.system.CommonResult;
import com.hc.entiry.system.PageBean;
import com.hc.param.ExceptionLogParam;
import com.hc.service.ExceptionLogService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
*@description 设备异常日志控制器
*@author hc
*@date 2024/12/26  17:51
*/
@RestController
@RequestMapping("/api/exceptionLog")
public class ExceptionLogController {

    @Resource
    private ExceptionLogService exceptionLogService;

    @GetMapping("/selectList")
    public CommonResult<PageBean<ExceptionLog>> selectList (ExceptionLogParam param){
        return exceptionLogService.selectList(param);
    }
}
