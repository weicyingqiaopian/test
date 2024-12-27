package com.hc.entiry.system;

import com.hc.customerEnum.StateEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
*@description 通用返回值
*@author hc
*@date 2024/12/24  10:14
*/
@Data
@AllArgsConstructor
@Builder
public class CommonResult <T> implements Serializable {

    private int code;
    private String message;

    private T data;

    public CommonResult(StateEnum stateEnum){
        this.code = stateEnum.getCode();
        this.message = stateEnum.getValue();
    }

    public CommonResult(StateEnum stateEnum,String message){
        this.code = stateEnum.getCode();
        this.message = message;
    }



    public CommonResult(T data){
        this.data = data;
    }
}
