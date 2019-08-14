package com.example.security_demo.service.impl;

import com.example.security_demo.entity.User;
import com.example.security_demo.repo.UserRepository;
import com.example.security_demo.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @ClassName JWTUserDetailsServiceImpl
 * @Description TODO
 * @Author pyt
 * @Date 2019/8/14 16:51
 * @Version
 */
@Service
public class JWTUserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    @Qualifier("userRepository")
    public UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> userOptional = userRepository.findByUsername(username);

        if (!userOptional.isPresent()) {
            throw new UsernameNotFoundException(String.format("No security found with username '%s'.", username));
        } else {
            return JwtUserFactory.create(user);
        }
    }
}
