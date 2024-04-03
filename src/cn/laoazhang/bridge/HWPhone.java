package cn.laoazhang.bridge;

public class HWPhone extends Phone{

    public HWPhone(Color color) {
        super.setColor(color);
    }
    public HWPhone(Color color,Price price) {
        super.setColor(color);
        super.setPrice(price);
    }
    @Override
    public void run() {
        color.useColor();
        price.usePrice();
        System.out.println("华为手机");
    }
}
