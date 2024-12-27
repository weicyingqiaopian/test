package com.hc.interceptor;

import com.hc.customerException.CustomerException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
*@description 自定义拦截器  获取认证信息
*@author hc
*@date 2024/12/24  9:45
*/
@Component
public class CustomerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        if (token==null){
            throw new CustomerException("无效token");
        }
        return true;
    }
}
