package cn.laoazhang.factory.simple2;

public class CoffeeStore {

    public static void main(String[] args) {

        Coffee coffee = orderCoffee("latte");
        System.out.println(coffee.getName());

    }


    public static Coffee orderCoffee(String type) {
        //通过工厂获得对象，不需要知道对象实现的细节
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        Coffee coffee = factory.createCoffee(type);
        //添加配料
        coffee.addMilk();
        coffee.addSuqar();
        return coffee;
    }
}
