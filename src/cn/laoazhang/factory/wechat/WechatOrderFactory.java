package cn.laoazhang.factory.wechat;

import cn.laoazhang.factory.OrderFactory;
import cn.laoazhang.factory.PayFactory;
import cn.laoazhang.factory.RefundFactory;

public class WechatOrderFactory implements OrderFactory {
    @Override
    public PayFactory createPay() {
        return new WechatPay();
    }

    @Override
    public RefundFactory createRefund() {
        return new WechatRefund();
    }
}
