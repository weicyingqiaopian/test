package com.hc.util;

import com.github.pagehelper.PageHelper;
import com.hc.entiry.system.PageDto;

/**
*@description 分页插件
*@author hc
*@date 2024/12/26  17:39
*/
public class PageHelperUtil {

    /**
    *@description
    *@author hc
    *@date 2024/12/26  17:43
    */
    public static void pageSort(PageDto pageDto, String orderBy,Boolean onlyGetCount,Boolean mapUnderscoreToCamelCase ) {
        if (onlyGetCount) {
            PageHelper.startPage(1, -1);
        } else {
            if (StringUtils.isNotBlank(pageDto.getSortName()) && StringUtils.isNotBlank(pageDto.getSortOrder())) {
                if (mapUnderscoreToCamelCase){
                    PageHelper.orderBy(StringUtils.camel2Underline(pageDto.getSortName()) + " " + pageDto.getSortOrder());
                }else {
                    PageHelper.orderBy((pageDto.getSortName()) + " " + pageDto.getSortOrder());
                }
            } else {
                PageHelper.orderBy(orderBy);
            }
            //分页
            Integer current = pageDto.getCurrent();
            Integer pageSize = pageDto.getPageSize();
            PageHelper.startPage(current == null ? 1 : current, pageSize == null ? PageDto.DEFAULT_PAGESIZE : pageSize);
        }
    }
}
