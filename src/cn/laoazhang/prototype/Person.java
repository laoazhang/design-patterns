package cn.laoazhang.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author laoazhang
 * @CreateTime 2024/3/31 22:28
 * @Version 1.0
 */
public class Person implements Cloneable, Serializable {

   private String name;

  private int age;

  private List<String> list = new ArrayList<String>();


    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Person() {
        System.out.println("构造函数调用");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }


    /**
     * 深拷贝
     * @return
     */
    public Object deepClone() {
        try {
            // 输出  序列化
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            // 输入  反序列化
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            Person copyObj = (Person) ois.readObject();
            return copyObj;

        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
