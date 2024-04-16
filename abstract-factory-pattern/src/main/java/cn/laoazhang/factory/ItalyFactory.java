package cn.laoazhang.factory;

/**
 * @Author laoazhang
 * @CreateTime 2024/4/16 22:08
 * @Version 1.0
 */
public class ItalyFactory implements ProductFactory {

    /**
     * 创建意大利咖啡
     * @return
     */
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new TiramisuDessert();
    }
}
