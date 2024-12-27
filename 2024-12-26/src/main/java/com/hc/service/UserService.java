package com.hc.service;

import com.hc.entiry.system.CommonResult;
import com.hc.param.UserParam;
import com.hc.vo.UserVo;

/**
*@description 用户服务接口
*@author hc
*@date 2024/12/26  16:06
*/
public interface UserService {
    
    /**
    *@description 登录
    *@author hc
    *@date 2024/12/26  16:06
    */
    CommonResult<UserVo> login(UserParam userParam);
}
