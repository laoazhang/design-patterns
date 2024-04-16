package cn.laoazhang.factory;

/**
 * 美式咖啡
 */
public class AmericanCoffee implements Coffee {
    @Override
    public String getName() {
        return "americanCoffee";
    }

    @Override
    public void addMilk() {
        System.out.println("AmericanCoffee...addMilk...");
    }

    @Override
    public void addSuqar() {
        System.out.println("AmericanCoffee...addSuqar...");
    }
}