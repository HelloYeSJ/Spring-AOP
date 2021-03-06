package com.ysj.spring.aop.service;

import com.ysj.spring.aop.security.CurrentUserHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthService {

    public void checkAccess(){
        String user = CurrentUserHolder.get();
        if (!"admin".equals(user)){
            throw new RuntimeException("operation not allow");
        }
    }
}
