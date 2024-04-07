package cn;

// import cn.laoazhang.factory.method.AliPayFactory;
// import cn.laoazhang.factory.method.PayFactory;
// import cn.laoazhang.factory.method.WechatPayFactory;

import cn.laoazhang.adapter.cls.Adapter;
import cn.laoazhang.adapter.cls.TargetModule;
import cn.laoazhang.bridge.*;
import cn.laoazhang.builder.Computer;
import cn.laoazhang.builder.Director;
import cn.laoazhang.builder.HighComputerBuilder;
import cn.laoazhang.builder.LowComputerBuilder;
import cn.laoazhang.composite.File;
import cn.laoazhang.composite.Folder;
import cn.laoazhang.composite.Root;
import cn.laoazhang.decorator.BigBike;
import cn.laoazhang.decorator.Bike;
import cn.laoazhang.decorator.RSCBikeDecorator;
import cn.laoazhang.decorator.SuonaBikeDecorator;
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

        // TargetModule targetModule = new Adapter();
        //
        // targetModule.methodA();
        //
        // targetModule.methodB();
        //
        // targetModule.methodC();

        // HWPhone blueHwPhone = new HWPhone(new BlueColor());
        // blueHwPhone.run();
        // HWPhone priceHwPhone = new HWPhone(new BlueColor(),new HwPrice());
        // priceHwPhone.run();
        //
        // ApplePhone applePhone = new ApplePhone(new RedColor());
        // applePhone.run();

        // 创造根文件夹
        // Root root1 = new Folder("C://");
        // 建立子文件夹
        // Root desktop = new Folder("桌面");

        // Root myComputer = new Folder("我的电脑");

        // 建立子文件
        // Root javaFile = new File("HelloWorld.java");

        //建立文件夹关系
        // root1.addFile(desktop);
        // root1.addFile(myComputer);

        //建立文件关系
        // myComputer.addFile(javaFile);

        //从0级开始展示，每下一级，多2条橫线
        // root1.display(0);

        // 另外一个根
        // Root root2 = new Folder("D://");
        // root2.display(0);

        // 选个自行车
        Bike bike = new BigBike();

        // 搭配了个RSC防爆胎
        bike = new RSCBikeDecorator(bike);

        // 搭配了个喇叭
        bike = new SuonaBikeDecorator(bike);
        bike = new SuonaBikeDecorator(bike);

        System.out.println(bike.getDescription()+"，价格："+ bike.getPrice());
    }
}
