package com.mmall.common;

/**
 * @program: mmall
 * @description:
 * @author: LiBo
 * @create: 2018-09-21 17:30
 **/
public class Const {

    public static final String CURRENT_USER = "currentuser";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface Role {
        int ROLE_CUSTOMER = 0;   //普通用户
        int ROLE_ADMIN = 1;     //管理员
    }

}
