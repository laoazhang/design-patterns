package cn;

// import cn.laoazhang.factory.method.AliPayFactory;
// import cn.laoazhang.factory.method.PayFactory;
// import cn.laoazhang.factory.method.WechatPayFactory;

import cn.laoazhang.adapter.cls.Adapter;
import cn.laoazhang.adapter.cls.TargetModule;
import cn.laoazhang.builder.Computer;
import cn.laoazhang.builder.Director;
import cn.laoazhang.builder.HighComputerBuilder;
import cn.laoazhang.builder.LowComputerBuilder;
import cn.laoazhang.factory.FactoryProducer;
import cn.laoazhang.factory.OrderFactory;
import cn.laoazhang.prototype.Person;

public class Main {

    public static void main(String[] args) {

        // 简单工厂模式
        // Pay pay = SimplePayFactory.createPay("WECHAT_PAY");
        // Pay pay = SimplePayFactory.createPay("ALI_PAY");
        // pay.unifiedorder();

        // PayFactory aliPayFactory = new AliPayFactory();
        // Pay aliPay = aliPayFactory.getPay();
        // aliPay.unifiedorder();
        //
        // PayFactory wechatPayFactory = new WechatPayFactory();
        // Pay wechatPay = wechatPayFactory.getPay();
        // wechatPay.unifiedorder();


        // OrderFactory orderFactory = FactoryProducer.getFactory("WECHAT");
        // orderFactory.createPay().unifiedorder();
        // orderFactory.createRefund().refund();


        // Director director = new Director();
        //
        // Computer lowComputer = director.create(new LowComputerBuilder());
        // Computer highComputer = director.create(new HighComputerBuilder());
        //
        // System.out.println(lowComputer.toString());
        // System.out.println(highComputer.toString());

        TargetModule targetModule = new Adapter();

        targetModule.methodA();

        targetModule.methodB();

        targetModule.methodC();

    }
}
