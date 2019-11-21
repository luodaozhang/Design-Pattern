package com.robot.design.pattern.behavioral.strategy;

public class EmptyPromotionStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("当前没有折扣");
    }
}
