package com.robot.design.pattern.structural.proxy.dynamicproxy;

import com.robot.design.pattern.structural.proxy.IOrderService;
import com.robot.design.pattern.structural.proxy.Order;
import com.robot.design.pattern.structural.proxy.OrderServiceImpl;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        IOrderService proxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        Order order = new Order();
        order.setOrderId(1);
        proxy.saveOrder(order);
    }
}
