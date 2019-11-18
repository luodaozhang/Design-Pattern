package com.robot.design.pattern.structural.facade;

public class ExpressService {

    public String expressGift(PointsGift gift){
        String expressNo = "123";
        System.out.println("物流已发货 单号:"+expressNo);
        return expressNo;
    }

}
