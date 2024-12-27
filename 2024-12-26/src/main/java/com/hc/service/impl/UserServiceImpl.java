package com.hc.service.impl;

import com.hc.entiry.system.CommonResult;
import com.hc.param.UserParam;
import com.hc.service.UserService;
import com.hc.vo.UserVo;
import org.springframework.stereotype.Service;

/**
*@description 用户服务实现类
*@author hc
*@date 2024/12/26  16:06
*/
@Service
public class UserServiceImpl implements UserService {

    /**
     * @param userParam
     * @description 登录
     * @author hc
     * @date 2024/12/26  16:06
     */
    @Override
    public CommonResult<UserVo> login(UserParam userParam) {
        return null;
    }
}
