package cn.laoazhang.factory;

/**
 * 意大利咖啡
 */
public class LatteCoffee implements Coffee {
    @Override
    public String getName() {
        return "latteCoffee";
    }

    @Override
    public void addMilk() {
        System.out.println("LatteCoffee...addMilk...");
    }

    @Override
    public void addSuqar() {
        System.out.println("LatteCoffee...addSuqar...");
    }
}
