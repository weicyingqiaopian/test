package com.hc.controller;


import com.hc.dao.TestMapper;
import com.hc.entiry.system.CommonResult;
import com.hc.param.UserParam;
import com.hc.service.UserService;
import com.hc.util.RedisUtil;
import com.hc.vo.UserVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
*@description user控制器
*@author hc
*@date 2024/12/24  10:04
*/
@RequestMapping("/api/user")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private RedisUtil redisUtil;

    @Resource
    private TestMapper testMapper;

    /**
    *@description 登录
    *@author hc
    *@date 2024/12/26  16:07
    */
    @PostMapping("/login")
    public CommonResult<UserVo> login(@RequestBody UserParam userParam){
        return userService.login(userParam);
    }

    @GetMapping("/test")
    public CommonResult<String> test(){
        Integer count = testMapper.test();
        return new CommonResult<>(count.toString());
    }

}
