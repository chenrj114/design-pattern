package chapter04_Singleton_Pattern.demo5;

/**
 * @ClassName Singleton
 * @Description 使用枚举方式创建单例
 * @Author rjchen
 * @Date 2020-05-14 16:32
 * @Version 1.0
 */
class Singleton1 {

    // 私有构造函数
    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;

        private Singleton1 singleton;

        // JVM保证这个方法绝对只调用一次
        Singleton() {
            singleton = new Singleton1();
        }

        public Singleton1 getInstance() {
            return singleton;
        }
    }
}
