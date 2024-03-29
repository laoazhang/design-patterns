package cn.laoazhang.factory;

public interface OrderFactory {

    PayFactory createPay();

    RefundFactory createRefund();


}
