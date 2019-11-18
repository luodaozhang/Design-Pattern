package com.robot.design.pattern.structural.proxy.staticproxy;

import com.robot.design.pattern.structural.proxy.Order;

public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderId(1);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }

}
