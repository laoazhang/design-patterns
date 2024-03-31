package cn.laoazhang.prototype;

/**
 * @Author laoazhang
 * @CreateTime 2024/3/31 22:35
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {

        Person person1 = new Person();
        person1.setAge(10);
        person1.setName("张三");
        person1.getList().add("aaa");

        // 浅拷贝
        // Person person2 = person1.clone();

        // 深拷贝
        Person person2 = (Person) person1.deepClone();
        person2.setName("李四");
        person2.getList().add("ccc");

        System.out.println("person1:" + person1.getName() + " age:" + person1.getAge());
        System.out.println("person2:" + person2.getName() + " age:" + person2.getAge());


    }
}
