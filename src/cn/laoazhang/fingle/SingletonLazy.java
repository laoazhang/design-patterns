package cn.laoazhang.fingle;

/**
 * 懒汉式单例
 * 1. 私有化构造方法
 * 2. 提供一个静态的私有的本类对象
 * 3. 提供一个公共的静态的方法获取本类对象
 */
public class SingletonLazy {

    // private static SingletonLazy instance;

    private SingletonLazy() {
    }

    /**
     * 单例模式的业务方法
     */
    public void process() {
        System.out.println("方法调用成功");
    }

    /**
     * 第一种实现方式
     * 对外暴露一个方法获取类的对象
     *
     * 线程不安全,多线程环境下可能会创建多个实例
     * @return
     */
    // public static SingletonLazy getInstance() {
    //     if (instance == null) {
    //         instance = new SingletonLazy();
    //     }
    //     return instance;
    // }

    /**
     * 第二种实现方式
     * 通过加锁 synchronized 来保证线程安全
     * 但是这种方式会导致性能下降
     * @return
     */
    // public static synchronized SingletonLazy getInstance() {
    //     if (instance == null) {
    //         instance = new SingletonLazy();
    //     }
    //     return instance;
    // }

    /**
     * 第三种实现方式
     * @return
     */
    // public static SingletonLazy getInstance() {
    //
    //     if (instance == null) {
    //         synchronized (SingletonLazy.class) {
    //             instance = new SingletonLazy();
    //         }
    //     }
    //     return instance;
    // }

    /**
     * 第四种实现方式
     * DCL 双重检查锁 (Double-Checked-Locking),在多线程情况下保证了高性能
     * 但是会出现指令重排的问题:
     *  1. 分配内存空间给对象
     *  2. 在内存空间中实例化对象
     *  3. 将对象指向内存空间，此时 instance != null
     *
     *  但是由于指令重排的问题，可能会出现 1 -> 3 -> 2 的情况
     * @return
     */
    // public static SingletonLazy getInstance() {
    //
    //     if (instance == null) {
    //         synchronized (SingletonLazy.class) {
    //             if (instance == null) {
    //                 instance = new SingletonLazy();
    //             }
    //         }
    //     }
    //     return instance;
    // }

    private static volatile SingletonLazy instance;

    /**
     * 第五种实现方式
     * 通过 volatile 关键字来禁止指令重排,保证线程安全,保证高性能,推荐使用,
     * 但是在 JDK 1.5 之前不适用,因为 volatile 保证了可见性,但是不保证原子性,所以在 JDK 1.5 之前还是会出现线程安全问题,
     * 但是在 JDK 1.5 之后,volatile 保证了原子性,所以可以保证线程安全,
     * @return
     */
    public static SingletonLazy getInstance() {

        if (instance == null) {
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}
