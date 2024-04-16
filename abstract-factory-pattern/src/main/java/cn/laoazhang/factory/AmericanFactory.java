package cn.laoazhang.factory;

/**
 * @Author laoazhang
 * @CreateTime 2024/4/16 22:08
 * @Version 1.0
 */
public class AmericanFactory implements ProductFactory {

    /**
     * 创建美式咖啡
     * @return
     */
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    /**
     * 创建抹茶慕斯甜点
     * @return
     */
    @Override
    public Dessert createDessert() {
        return new MatchaMousseDessert();
    }
}
