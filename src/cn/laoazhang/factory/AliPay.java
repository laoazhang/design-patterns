package cn.laoazhang.factory;

public class AliPay implements Pay{
    @Override
    public void unifiedorder() {

        System.out.println("支付宝支付 统一下单接口");
    }
}
