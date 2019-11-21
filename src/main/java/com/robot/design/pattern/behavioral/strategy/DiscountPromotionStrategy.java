package com.robot.design.pattern.behavioral.strategy;

public class DiscountPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("打折促销.");
    }
}
