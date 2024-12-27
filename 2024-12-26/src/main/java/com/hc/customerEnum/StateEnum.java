package com.hc.customerEnum;


import java.io.Serializable;

/**
*@description 异常枚举类
*@author hc
*@date 2024/12/24  10:11
*/
public enum StateEnum implements Serializable {

     TOKEN_VALID(1100,"token无效"),
     Error(5000,"错误"),
    OK(10000,"成功" );

    private int code;

    private String value;

    StateEnum(int code, String value){
        this.code = code;
        this.value =value;
    }


    public int getCode() {
        return code;
    }

    public String getValue() {
        return value;
    }
}
