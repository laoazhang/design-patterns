package cn.laoazhang.composite;

/**
 * 这个类是没有节点，不用存储其他子类数组，所以是叶子节点
 * @Author laoazhang
 * @CreateTime 2024/4/5 23:47
 * @Version 1.0
 */
public class File extends Root{

    public File(String name) {
        super(name);
    }

    @Override
    public void addFile(Root root) {

    }

    @Override
    public void removeFile(Root root) {

    }

    @Override
    public void display(int root) {

    }
}
