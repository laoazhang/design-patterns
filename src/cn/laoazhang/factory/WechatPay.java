package cn.laoazhang.factory;

public class WechatPay implements Pay{

    @Override
    public void unifiedorder() {
        System.out.println("微信支付 统一下单接口");
    }
}
