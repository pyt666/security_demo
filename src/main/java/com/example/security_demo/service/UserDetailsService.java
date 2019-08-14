package com.example.security_demo.service;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * @ClassName UserDetailsService
 * @Description TODO
 * @Author pyt
 * @Date 2019/8/14 16:49
 * @Version
 */
public interface UserDetailsService {
    UserDetails loadUserByUsername(String var1);
}
