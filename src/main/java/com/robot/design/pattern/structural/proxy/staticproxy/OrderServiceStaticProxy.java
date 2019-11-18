package com.robot.design.pattern.structural.proxy.staticproxy;

import com.robot.design.pattern.structural.proxy.IOrderService;
import com.robot.design.pattern.structural.proxy.Order;
import com.robot.design.pattern.structural.proxy.OrderServiceImpl;

public class OrderServiceStaticProxy {

    private IOrderService orderService;

    public int saveOrder(Order order){
        orderService = new OrderServiceImpl();

        beforeMethod();
        int i = orderService.saveOrder(order);
        afterMethod();

        return i;
    }

    public void beforeMethod(){
        System.out.println("静态代理 before code");

    }

    public void afterMethod(){
        System.out.println("静态代理 after code");

    }
}
