package cn.laoazhang.adapter.cls;

public class Adapter extends OldModule implements TargetModule{

    /**
     * 新的方法，和老的类方法不一样
     */
    @Override
    public void methodB() {
        System.out.println("Adapter methodB");
    }

    /**
     * 新的方法，和老的类方法不一样
     */
    @Override
    public void methodC() {
        System.out.println("Adapter methodC");

    }
}
