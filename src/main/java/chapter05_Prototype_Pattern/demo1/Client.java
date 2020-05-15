package chapter05_Prototype_Pattern.demo1;

/**
 * @ClassName Client
 * @Description  在客户类中我们只需要创建一个ConcretePrototype对象作为原型对象，然后调用其clone()方法即可得到对应的克隆对象
 * @Author rjchen
 * @Date 2020-05-15 9:52
 * @Version 1.0
 */
public class Client {
    public void createPrototype() {
        Prototype obj1  = new ConcretePrototype();
        obj1.setAttr("Sunny");
        Prototype obj2  = obj1.clone();
    }
}
