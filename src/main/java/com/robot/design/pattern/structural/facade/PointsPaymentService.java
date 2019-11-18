package com.robot.design.pattern.structural.facade;

public class PointsPaymentService {

    public boolean pay(PointsGift gift){
        System.out.println("支付完成");
        return true;
    }

}
