package chapter02_Factory_Method_Pattern.demo2;

/**
 * @ClassName ConcreteFactory
 * @Description 工厂方法模式定义一个用于创建对象的接口，让子类决定将哪一个类实例化。让一个类的实例化延迟到其子类。
 * 某种类型的具体产品由专门的具体工厂创建，具体工厂和具体产品之间一一对应。
 * @Author rjchen
 * @Date 2020-05-12 20:54
 * @Version 1.0
 */
class ConcreteFactory implements Factory {
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
