package com.robot.design.pattern.structural.proxy.dynamicproxy;

import com.robot.design.pattern.structural.proxy.IOrderService;
import org.junit.Before;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod();
        Object invoke = method.invoke(target, args);
        afterMethod();
        return invoke;
    }

    public void beforeMethod(){
        System.out.println("动态代理 before code");

    }

    public void afterMethod(){
        System.out.println("动态代理 after code");

    }
}
