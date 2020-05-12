package chapter01_Simple_Factory_Pattern.demo2;

/**
 * @ClassName Factory
 * @Description 工厂类提供了一个【静态工厂方法】供客户端使用，
 * 根据所传入的参数不同可以创建不同的产品对象
 * @Author rjchen
 * @Date 2020-05-12 18:44
 * @Version 1.0
 */
public class Factory {
    //静态工厂方法
    public static Product getProduct(String arg) {
        Product product = null;
        if (arg.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
            //初始化设置product
        }
        else if (arg.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
            //初始化设置product
        }
        return product;
    }
}
