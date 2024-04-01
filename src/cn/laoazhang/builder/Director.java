package cn.laoazhang.builder;

/**
 * 将产品和创建过程时行解耦，使用相同的创建过程创建不同的产品，控制产品生产过程
 * Director是全程择指导组装过程，具体的细节还是builder去操作
 */
public class Director {
    public Computer create(Builder builder){
        builder.buildCpu();
        builder.buildMemory();
        builder.builMainboard();
        builder.buildDisk();
        builder.buildPower();

        return builder.createComputer();
    }
}
