package cn.laoazhang.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShoppingCartManager {
    // 饿汉模式实现单例
    private static final ShoppingCartManager instance = new ShoppingCartManager();

    // 购物车存储商品和数量的眏射
    private Map<String, Integer> cart;

    // 私用构造函数
    private ShoppingCartManager() {
        cart = new LinkedHashMap<>();
    }

    // 获取购物车实例
    public static ShoppingCartManager getInstance() {
        return instance;
    }

    // 添加商品到购物车
    public void addToCart(String itemName, int quantity) {
        cart.put(itemName, cart.getOrDefault(itemName, 0) + quantity);
    }

    // 查看购物车
    public void viewCart() {
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
