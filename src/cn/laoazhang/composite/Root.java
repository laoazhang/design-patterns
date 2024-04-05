package cn.laoazhang.composite;

/**
 * 根节点，向象类，通用的属性和方法
 * @Author laoazhang
 * @CreateTime 2024/4/5 23:34
 * @Version 1.0
 */
public abstract class Root {

    private String name;

    public Root(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void addFile(Root root);

    public abstract void removeFile(Root root);

    public abstract void display(int root);
}
