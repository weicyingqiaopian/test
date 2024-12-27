package com.hc.customerException;

import com.hc.customerEnum.StateEnum;
import com.hc.entiry.system.CommonResult;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
*@description 全局异常捕获
*@author hc
*@date 2024/12/24  10:08
*/
@Component
@RestControllerAdvice
public class GlobalExceptionCatch {


    @ExceptionHandler(CustomerException.class)
    @ResponseStatus(HttpStatus.OK)
    public CommonResult GlobalExceptionHandle(CustomerException e){
        return new CommonResult<>(StateEnum.Error,"无效token");
    }

}
