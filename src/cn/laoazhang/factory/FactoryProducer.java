package cn.laoazhang.factory;

import cn.laoazhang.factory.ali.AliOrderFactory;
import cn.laoazhang.factory.wechat.WechatOrderFactory;

/**
 * 超级工厂创造器,简单工厂模式
 */
public class FactoryProducer {

    public static OrderFactory getFactory(String type) {
        if (type.equalsIgnoreCase("WECHAT")) {
            return new WechatOrderFactory();
        } else if (type.equalsIgnoreCase("ALI")) {
            return new AliOrderFactory();
        }
        return null;
    }
}
