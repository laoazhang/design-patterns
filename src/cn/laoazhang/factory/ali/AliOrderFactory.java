package cn.laoazhang.factory.ali;

import cn.laoazhang.factory.OrderFactory;
import cn.laoazhang.factory.PayFactory;
import cn.laoazhang.factory.RefundFactory;

public class AliOrderFactory implements OrderFactory {
    @Override
    public PayFactory createPay() {
        return new AliPay();
    }

    @Override
    public RefundFactory createRefund() {
        return new AliRefund();
    }
}
