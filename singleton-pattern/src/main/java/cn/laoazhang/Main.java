package cn.laoazhang;

import cn.laoazhang.demo.ShoppingCartManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ShoppingCartManager cart = ShoppingCartManager.getInstance();
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("0")) {
            String itemName = scanner.next();
            int quantity = scanner.nextInt();

            // 获取购物车实例并添加商品
            cart.addToCart(itemName, quantity);
        }
        // 输出购物车内容
        cart.viewCart();
    }
}

