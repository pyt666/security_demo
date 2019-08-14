package com.example.security_demo.entity;

import java.util.Date;
import java.util.List;

/**
 * @ClassName User
 * @Description TODO
 * @Author pyt
 * @Date 2019/8/14 16:39
 * @Version
 */
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Date lastPasswordResetDate;
    private List<Authority> authorities;
}
