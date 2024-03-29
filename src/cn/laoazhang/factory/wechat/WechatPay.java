package cn.laoazhang.factory.wechat;

import cn.laoazhang.factory.PayFactory;

public class WechatPay implements PayFactory {

    @Override
    public void unifiedorder() {
        System.out.println("微信支付 统一下单接口");
    }
}
