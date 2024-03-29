package cn;

import cn.laoazhang.factory.Pay;
import cn.laoazhang.factory.method.AliPayFactory;
import cn.laoazhang.factory.method.PayFactory;
import cn.laoazhang.factory.method.WechatPayFactory;
import cn.laoazhang.factory.simple.SimplePayFactory;

public class Main {

    public static void main(String[] args) {

        // 简单工厂模式
        // Pay pay = SimplePayFactory.createPay("WECHAT_PAY");
        // Pay pay = SimplePayFactory.createPay("ALI_PAY");
        // pay.unifiedorder();

        PayFactory aliPayFactory = new AliPayFactory();
        Pay aliPay = aliPayFactory.getPay();
        aliPay.unifiedorder();

        PayFactory wechatPayFactory = new WechatPayFactory();
        Pay wechatPay = wechatPayFactory.getPay();
        wechatPay.unifiedorder();
    }
}
