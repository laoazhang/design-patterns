package cn.laoazhang.factory;

/**
 * 产品工厂
 * @Author laoazhang
 * @CreateTime 2024/4/16 21:54
 * @Version 1.0
 */
public interface ProductFactory {

    /**
     * 创建咖啡
     * @return
     */
    public Coffee createCoffee();

    /**
     * 创建甜点
     * @return
     */
    public Dessert createDessert();
}
