package com.hc.util;


import org.springframework.cglib.beans.BeanMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: bean 工具类
 * @Author: knight
 * @Date: 2022/5/20 9:28
 */
public class BeanUtil {
    /**
     * @Description: 将 Bean 转为 map
     * @Author: knight
     * @Date: 2022/5/20 9:20
     */
    public static <T> Map<String, Object> beanToMap(T bean) {
        BeanMap beanMap = BeanMap.create(bean);
        Map<String, Object> map = new HashMap<>();

        beanMap.forEach((key, value) -> {
            map.put(String.valueOf(key), value);
        });
        return map;
    }

    /**
     * @Description: 将 map 转换为 bean
     * @Author: knight
     * @Date: 2022/5/20 9:28
     */
    public static <T> T mapToBean(Map<String, Object> map, Class<T> clazz)
            throws IllegalAccessException, InstantiationException {
        T bean = clazz.newInstance();
        BeanMap beanMap = BeanMap.create(bean);
        beanMap.putAll(map);
        return bean;
    }
}
