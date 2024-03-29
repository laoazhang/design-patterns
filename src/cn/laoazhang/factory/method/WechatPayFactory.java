package cn.laoazhang.factory.method;

import cn.laoazhang.factory.Pay;
import cn.laoazhang.factory.WechatPay;

public class WechatPayFactory implements PayFactory{
    @Override
    public Pay getPay() {
        return new WechatPay();
    }
}