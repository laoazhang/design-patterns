package cn.laoazhang.factory.simple;

import cn.laoazhang.factory.AliPay;
import cn.laoazhang.factory.Pay;
import cn.laoazhang.factory.WechatPay;

public class SimplePayFactory {

    /**
     * 根据参数 返回对应的支付对象
     * @param payType
     * @return
     */
    public static Pay createPay(String payType) {

        if (payType == null) {
            return null;
        }
        if (payType.equalsIgnoreCase("WECHAT_PAY")) {
            return new WechatPay();
        }else if (payType.equalsIgnoreCase("ALI_PAY")) {
            return new AliPay();
        }
        // 想拓展，直接编写更多
        return null;
    }
}
