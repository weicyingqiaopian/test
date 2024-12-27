package com.hc.entiry.system;

import cn.hutool.core.convert.Convert;
import com.hc.util.BeanUtil;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
*@description 分页信息
*@author hc
*@date 2024/12/26  17:48
*/
@Data
public class PageBean<T> implements Serializable {
    private static final long serialVersionUID = 1000L;


    private Integer total; //总记录数

    private List<T> rows; //结果集

    private int pageNumber; //第几页

    private int pageSize; //每页记录数

    private int pages; // 总页数

    private int size; //当前页的数量<=pageSize

    public PageBean(Object obj) {
        Map map = BeanUtil.beanToMap(obj);
        if(map!=null){
            this.pageNumber = Convert.toInt(map.get("pageNum"));
            this.pageSize = Convert.toInt(map.get("pageSize"));
            this.total = Convert.toInt(map.get("total"));
            this.pages = Convert.toInt(map.get("pages"));
            this.rows = obj == null ? new ArrayList<>() : (List<T>)obj;
            this.size = this.rows.size();
        }
    }

    public PageBean(Object object, PageDto pageDto, Integer total) {
        this.pageNumber = pageDto.getCurrent();
        this.pageSize = pageDto.getPageSize();
        this.total = total;
        if (total % pageSize == 0) {
            this.pages =  total / pageSize;
        } else {
            this.pages =  total / pageSize + 1;
        }

        this.rows = object == null ? new ArrayList<>() : (List<T>)object;
        this.size = rows.size();
    }

    public PageBean() {
    }
}