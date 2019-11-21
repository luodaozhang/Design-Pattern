package com.robot.design.pattern.behavioral.strategy;

public class FullReductionPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减促销");
    }
}
