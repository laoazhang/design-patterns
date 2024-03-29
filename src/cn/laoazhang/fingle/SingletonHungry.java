package cn.laoazhang.fingle;

/**
 * 饿汉式单例
 * 1. 私有化构造方法
 * 2. 提供一个静态的私有的本类对象
 * 3. 提供一个公共的静态的方法获取本类对象
 */
public class SingletonHungry {
    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {}

    public static SingletonHungry getInstance() {
        return instance;
    }

    /**
     * 单例模式的业务方法
     */
    public void process(){
        System.out.println("方法调用成功");
    }
}
