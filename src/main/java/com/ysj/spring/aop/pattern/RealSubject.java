package com.ysj.spring.aop.pattern;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("real subject execute request");
    }
}
