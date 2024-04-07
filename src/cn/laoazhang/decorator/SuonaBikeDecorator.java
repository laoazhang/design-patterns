package cn.laoazhang.decorator;

/**
 *  喇叭，角色 ConcreteDecorator
 */
public class SuonaBikeDecorator extends BikeDecorator{

    private String description="增加一个喇叭";

    private Bike bike;

    public SuonaBikeDecorator(Bike bike) {
        this.bike=bike;
    }

    @Override
    public String getDescription() {
        return bike.getDescription()+","+description;
    }

    /**
     * 唢呐践喇叭的价格
     * @return
     */
    @Override
    public int getPrice() {
        return bike.getPrice()+50;
    }
}
