package chapter04_Singleton_Pattern.demo3;

/**
 * @ClassName LazySingleton
 * @Description 懒汉模式使用了 Lazy Load(延迟加载)
 * 懒汉式单例类在第一次使用时创建，无须一直占用系统资源，实现了延迟加载，
 * 但是必须处理好多个线程同时访问的问题，特别是当单例类作为资源控制器，在实例化时必然涉及资源初始化，
 * 而资源初始化很有可能耗费大量时间，这意味着出现多线程同时首次引用此类的机率变得较大，
 * 需要通过双重检查锁定等机制进行控制，这将导致系统性能受到一定影响。
 * @Author rjchen
 * @Date 2020-05-14 16:01
 * @Version 1.0
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private volatile static LazySingleton volatileInstance = null;

    private LazySingleton() { }

    /**
     *  避免多个线程同时调用getInstance, 对工厂方法进行加锁
     */
    synchronized public static LazySingleton getInstance1() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     *  getInstance1的问题在于, 每次getInstance1时都要进行加锁, 大大降低了多线程并发访问环境的性能
     *  只需要对new LazySingleton()进行加锁, 降低锁的粒度
     */
    public static LazySingleton getInstance2() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                instance = new LazySingleton();
            }
        }
        return instance;
    }

    /**
     *  getInstance2的问题在于, 先检查后执行的方式, 不是线程安全的。
     *  假设线程A执行 if (instance == null), 条件满足, 此时线程切换到B if (instance == null) 条件同样满足
     *  线程再次切回A, A执行new LazySingleton(), 再切回B, B也执行new LazySingleton(), 就出现了两个实例。
     *
     *  所以在new LazySingleton()的同步语句块中, 再加上一个判断语句, 这种方式称为双重检查锁定(Double-Check Locking)。
     */
    public static LazySingleton getInstance3() {
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (instance == null) {
                    instance = new LazySingleton(); //创建单例实例
                }
            }
        }
        return instance;
    }

    /**
     * Double-Check Locking (双重检查锁定) 同样不是线程安全的, 原因是虚拟机执行了乱序优化
     * 解决办法是使用volatile类型的变量, 在java1.5以上的版本中, volatile屏蔽虚拟机乱序执行优化
     * 此种方法依旧会降低系统的性能
     */
    public static LazySingleton getInstance4() {
        if (volatileInstance == null) {
            //锁定代码块
            synchronized (LazySingleton.class) {
                //第二重判断
                if (volatileInstance == null) {
                    volatileInstance = new LazySingleton(); //创建单例实例
                }
            }
        }
        return volatileInstance;
    }
}
