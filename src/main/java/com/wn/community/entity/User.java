package com.wn.community.entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private int type;
    private int status;
    //这里是驼峰式命名，对应到数据库表中的列名则是activation_code
    private String activationCode;
    private String headerUrl;
    private Data createTime;
}
