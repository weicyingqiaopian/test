package com.hc.entiry.system;

import lombok.Data;

/**
*@description 分页信息
*@author hc
*@date 2024/12/26  17:38
*/
@Data
public class PageDto {
    public static Integer DEFAULT_PAGESIZE = 20;

    /***页码*/
    private Integer current;
    /***条数*/
    private Integer pageSize;
    /***排序名称*/
    private String sortName;
    /***排序规则*/
    private String sortOrder;
}
