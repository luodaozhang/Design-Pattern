package com.robot.design.pattern.behavioral.strategy;

public class Test {

    public static void main(String[] args) {
        PromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy(PromotionStrategyFactory.PromotionKey.FULL_REDUCTION);
        promotionStrategy.doPromotion();

        promotionStrategy = new DiscountPromotionStrategy();
        promotionStrategy.doPromotion();
    }

}
