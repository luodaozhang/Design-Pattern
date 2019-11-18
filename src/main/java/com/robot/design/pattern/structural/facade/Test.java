package com.robot.design.pattern.structural.facade;

public class Test {

    public static void main(String[] args) {
        GiftExchangeFacade giftExchangeFacade = new GiftExchangeFacade();

        PointsGift pointsGift = new PointsGift();
        pointsGift.setName("Iphone 11");

        giftExchangeFacade.exchage(pointsGift);
    }

}
