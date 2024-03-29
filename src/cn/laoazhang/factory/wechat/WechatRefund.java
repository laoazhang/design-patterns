package cn.laoazhang.factory.wechat;

import cn.laoazhang.factory.RefundFactory;

public class WechatRefund implements RefundFactory {
    @Override
    public void refund() {
        System.out.println("微信退款");
    }
}
