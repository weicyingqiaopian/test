package com.hc.entiry;


import lombok.Data;

import java.util.Date;

/**
*@description 用户
*@author hc
*@date 2024/12/26  16:00
*/
@Data
public class User {
    private Long id;
    private String userName;
    private String passWord;
    private String nickName;
    private Integer roleId;
    private Long companyId;
    private Date createdDate;
    private Long createByUserId;
}
