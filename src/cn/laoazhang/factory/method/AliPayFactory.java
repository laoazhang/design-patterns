package cn.laoazhang.factory.method;

import cn.laoazhang.factory.AliPay;
import cn.laoazhang.factory.Pay;

public class AliPayFactory implements PayFactory{
    @Override
    public Pay getPay() {
        return new AliPay();
    }
}
