package cn.laoazhang.decorator;

public class BikeDecorator implements Bike{

    private String description = "我只是装饰器，啥都不表示，子类帮我传递";


    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
