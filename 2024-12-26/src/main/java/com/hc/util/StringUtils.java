package com.hc.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
*@description String工具类
*@author hc
*@date 2024/12/26  17:40
*/
public class StringUtils {

    private static final Pattern PATTERN= Pattern.compile("[A-Z]([a-z\\d]+)?");


    /**
    *@description 判断是否为空
    *@author hc
    *@date 2024/12/26  17:41
    */
    public static boolean isEmpty(String str) {
        return null == str || str.trim().equals("") || "null".equals(str);
    }

    /**
    *@description 判断是否非空
    *@author hc
    *@date 2024/12/26  17:41
    */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
    *@description 判断是否blank
    *@author hc
    *@date 2024/12/26  17:41
    */
    public static boolean isBlank(String... list) {
        for (String string : list) {
            if (StringUtils.isBlank(string)) {
                return true;
            }
        }
        return false;
    }

   /**
   *@description 判断是否非blank
   *@author hc
   *@date 2024/12/26  17:41
   */
    public static boolean isNotBlank(String... list) {
        return !isBlank(list);
    }

   /**
   *@description 驼峰转下划线
   *@author hc
   *@date 2024/12/26  17:41
   */
    public static String camel2Underline(String line){
        if(line == null || "".equals(line)){
            return "";
        }
        line = String.valueOf(line.charAt(0)).toUpperCase().concat(line.substring(1));
        StringBuilder sb = new StringBuilder();
        Matcher matcher = PATTERN.matcher(line);
        while(matcher.find()){
            String word = matcher.group();
            sb.append(word.toUpperCase());
            sb.append(matcher.end() == line.length() ? "" : "_");
        }
        return sb.toString();
    }

    /**
    *@description 下划线转驼峰
    *@author hc
    *@date 2024/12/26  17:41
    */
    public static String Underline2camel(String para){
        StringBuilder result=new StringBuilder();
        String[] a =para.split("_");
        for(String s:a){
            if (!para.contains("_")) {
                result.append(s);
                continue;
            }
            if(result.length()==0){
                result.append(s.toLowerCase());
            }else{
                result.append(s.substring(0, 1).toUpperCase());
                result.append(s.substring(1).toLowerCase());
            }
        }
        return result.toString();
    }
    
}
