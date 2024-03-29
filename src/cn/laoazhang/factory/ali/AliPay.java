package cn.laoazhang.factory.ali;

import cn.laoazhang.factory.PayFactory;

public class AliPay implements PayFactory {
    @Override
    public void unifiedorder() {

        System.out.println("支付宝支付 统一下单接口");
    }
}
