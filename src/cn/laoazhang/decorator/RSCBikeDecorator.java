package cn.laoazhang.decorator;

/**
 * RSC 是防爆胎的缩写，角色 ConcreteDecorator
 */
public class RSCBikeDecorator extends BikeDecorator{

    private String description="增加一个防爆胎";

    private Bike bike;

    public RSCBikeDecorator(Bike bike) {
        this.bike=bike;
    }

    @Override
    public String getDescription() {
        return bike.getDescription()+","+description;
    }

    /**
     * 防爆胎的价格
     * @return
     */
    @Override
    public int getPrice() {
        return bike.getPrice()+100;
    }
}
