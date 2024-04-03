package cn.laoazhang.bridge;

/**
 * 抽象角色 手机
 */
public abstract class Phone {

    /**
     * 通过组合的方式来桥接其他行为
     */
    protected Color color;

    /**
     * 通过组合的方式来桥接其他行为
     */
    protected Price price;

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    /**
     * 手机的方法
     */
    abstract public void run();
}
