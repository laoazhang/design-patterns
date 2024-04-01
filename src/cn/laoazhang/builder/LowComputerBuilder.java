package cn.laoazhang.builder;

/**
 * 具体的建造者，实现builder来创建不同的产品
 */
public class LowComputerBuilder implements Builder{

    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("低配 CPU");
    }

    @Override
    public void builMainboard() {
        computer.setMainboard("低配 主板");
    }

    @Override
    public void buildDisk() {
        computer.setDisk("低配 硬盘");
    }

    @Override
    public void buildPower() {
        computer.setPower("低配 电源");
    }

    @Override
    public void buildMemory() {
        computer.setMemory("低配 内存");
    }

    @Override
    public Computer createComputer() {
        return computer;
    }
}
