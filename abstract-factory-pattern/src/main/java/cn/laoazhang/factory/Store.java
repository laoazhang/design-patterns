package cn.laoazhang.factory;

public class Store {

    public static void main(String[] args) {
        //可以根据不同的工厂，创建不同的产品
        Store americanStore = new Store(new AmericanFactory());
        Coffee americanCoffee = americanStore.orderAmericanCoffeeStore();
        Dessert dessert = americanStore.orderAmericanDessertFactory();
        System.out.println(americanCoffee.getName());
        System.out.println(dessert);

        Store italyFactory = new Store(new ItalyFactory());
        Coffee italyCoffee = italyFactory.orderItalyCoffeeStore();
        Dessert italyDessert = italyFactory.orderItalyDessertFactory();
        System.out.println(italyCoffee.getName());
        System.out.println(italyDessert);

    }

    private AmericanFactory americanFactory;

    private ItalyFactory italyFactory;

    public Store(AmericanFactory americanFactory){
        this.americanFactory = americanFactory;
    }

    public Store(ItalyFactory italyFactory){
        this.italyFactory = italyFactory;
    }


    public Coffee orderAmericanCoffeeStore(){
        Coffee coffee = americanFactory.createCoffee();
        //添加配料
        coffee.addMilk();
        coffee.addSuqar();
        return coffee;
    }

    public Dessert orderAmericanDessertFactory(){
        Dessert dessert = americanFactory.createDessert();
        return dessert;
    }

    public Coffee orderItalyCoffeeStore(){
        Coffee coffee = italyFactory.createCoffee();
        //添加配料
        coffee.addMilk();
        coffee.addSuqar();
        return coffee;
    }

    public Dessert orderItalyDessertFactory(){
        Dessert dessert = italyFactory.createDessert();
        return dessert;
    }
}
