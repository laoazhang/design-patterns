package cn.laoazhang.bridge;

public class SXPhone extends Phone{
    public SXPhone(Color color) {
        super.setColor(color);
    }
    @Override
    public void run() {
        color.useColor();
        System.out.println("三星手机");
    }
}
