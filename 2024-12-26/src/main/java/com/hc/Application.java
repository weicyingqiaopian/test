package com.hc;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
*@description 应用启动程序
*@author hc
*@date 2024/12/24  9:33
*/
@SpringBootApplication
@MapperScan("com.hc.dao")
public class Application
{
    public static void main( String[] args )
    {
        SpringApplication.run(Application.class,args);
    }
}
