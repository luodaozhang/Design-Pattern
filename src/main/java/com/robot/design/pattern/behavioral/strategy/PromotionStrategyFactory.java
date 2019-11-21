package com.robot.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {

    private static final Map<String,PromotionStrategy> STRATEGY_MAP = new HashMap<>();

    static {
        STRATEGY_MAP.put("EMPTY",new EmptyPromotionStrategy());
        STRATEGY_MAP.put("DISCOUNT",new DiscountPromotionStrategy());
        STRATEGY_MAP.put("FULL_REDUCTION",new FullReductionPromotionStrategy());
    }

    public interface PromotionKey{
        String DISCOUNT = "DISCOUNT";
        String FULL_REDUCTION = "FULL_REDUCTION";
        String EMPTY = "EMPTY";
    }

    public static PromotionStrategy getPromotionStrategy(String key){
        PromotionStrategy promotionStrategy = STRATEGY_MAP.get(key);
        return promotionStrategy == null ? STRATEGY_MAP.get("EMPTY"):promotionStrategy;
    }

}
