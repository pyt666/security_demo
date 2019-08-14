package com.example.security_demo.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Date;

/**
 * @ClassName JwtUser
 * @Description TODO
 * @Author pyt
 * @Date 2019/8/14 16:36
 * @Version
 */
public class JwtUser implements UserDetails {

    private final Integer id;
    private final String username;
    private final String password;
    private final String email;
    private final Collection<? extends GrantedAuthority> authorities;
    private final Date lastPasswordResetDate;

}
