package chapter02_Factory_Method_Pattern.demo2;

import org.junit.Test;

/**
 * @ClassName Test
 * @Description
 * @Author rjchen
 * @Date 2020-05-12 20:57
 * @Version 1.0
 */
public class TestClient {

    /**
     * 简单工厂模式最大的缺点是当有新产品要加入到系统中时，必须修改工厂类，
     * 需要在其中加入必要的业务逻辑，这违背了“开闭原则”
     *
     * 在简单工厂模式中，所有的产品都由同一个工厂创建，工厂类职责较重，业务逻辑较为复杂，
     * 具体产品与工厂类之间的耦合度高，严重影响了系统的灵活性和扩展性
     *
     * 工厂方法模式定义一个用于创建对象的接口，让子类决定将哪一个类实例化。让一个类的实例化延迟到其子类。
     * 某种类型的具体产品由专门的具体工厂创建，具体工厂和具体产品之间一一对应。
     */

    @Test
    public void test1() {
        Factory factory;
        factory = new ConcreteFactory(); //可通过配置文件实现
        Product product;
        product = factory.factoryMethod();
    }

}
