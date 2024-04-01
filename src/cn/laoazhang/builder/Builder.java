package cn.laoazhang.builder;

/**
 * 声明了建造者的公共方法
 */
public interface Builder {

    /**
     * 细节方法
     */
    void buildCpu();

    void builMainboard();

    void buildDisk();

    void buildPower();

    void buildMemory();

    Computer createComputer();
}
