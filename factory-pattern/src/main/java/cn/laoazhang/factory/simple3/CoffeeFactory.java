package cn.laoazhang.factory.simple3;

/**
 * 工厂模式使用场景较多
 * 咖啡工厂接口
 */
public interface CoffeeFactory {

    /**
     * 创建咖啡
     * @return
     */
    public Coffee createCoffee();
}
