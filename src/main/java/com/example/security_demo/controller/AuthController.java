package com.example.security_demo.controller;

import com.example.security_demo.entity.User;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName AuthController
 * @Description TODO
 * @Author pyt
 * @Date 2019/8/14 17:43
 * @Version
 */
@RestController
@RequestMapping("/auth/")
public class AuthController {
    @RequestMapping(value = "register", method = RequestMethod.POST)
    public User register(@RequestBody User addedUser) throws AuthenticationException {
        return authService.register(addedUser);
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login(@RequestParam("username") String name, @RequestParam("password") String password) throws AuthenticationException {
        return authService.login(name, password);
    }
}