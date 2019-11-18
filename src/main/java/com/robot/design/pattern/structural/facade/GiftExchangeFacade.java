package com.robot.design.pattern.structural.facade;

public class GiftExchangeFacade {

    private QualifyService qualifyService = new QualifyService();

    private PointsPaymentService pointsPaymentService = new PointsPaymentService();

    private ExpressService expressService = new ExpressService();

    public void exchage(PointsGift gift){

        if(qualifyService.isAvailable(gift)){
            //资格校验通过
            if(pointsPaymentService.pay(gift)){
                //如果支付积分成功
                String shippingOrderNo = expressService.expressGift(gift);
                System.out.println("物流系统下单成功,订单号是:"+shippingOrderNo);
            }
        }

    }

}
