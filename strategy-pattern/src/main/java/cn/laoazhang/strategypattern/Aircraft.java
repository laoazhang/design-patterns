package cn.laoazhang.strategypattern;

/**
 * 飞机策略类
 */
public class Aircraft implements TravelStrategy{
    @Override
    public void travel() {
        System.out.println("选择飞机出行...");
    }
}
