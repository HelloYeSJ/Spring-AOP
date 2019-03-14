package com.ysj.spring.aop.dynamic;

import com.ysj.spring.aop.pattern.RealSubject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxySubject implements InvocationHandler {

    private RealSubject realSubject;

    public JdkProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result = null;
        try {
            result = method.invoke(realSubject,args);
        }catch (Exception e){
            System.out.println("ex:"+e);
            throw e;
        }finally {
            System.out.println("after");
        }
        return result;
    }
}
