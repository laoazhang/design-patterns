package cn.laoazhang.factory.ali;

import cn.laoazhang.factory.RefundFactory;

public class AliRefund implements RefundFactory{
    @Override
    public void refund() {
        System.out.println("支付宝退款");
    }
}
