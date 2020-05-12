package chapter01_Simple_Factory_Pattern.demo4;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName SimpleProduct
 * @Description 我们可以将抽象产品类和工厂类合并，将【静态工厂方法移至抽象产品类】中
 * @Author rjchen
 * @Date 2020-05-12 19:21
 * @Version 1.0
 */
@Slf4j
public abstract class SimpleProduct {

    public static SimpleProduct getProduct(String arg) {
        SimpleProduct product = null;
        if (arg.equalsIgnoreCase("A")) {
            product = new SimpleConcreteProductA();
            //初始化设置product
        }
        else if (arg.equalsIgnoreCase("B")) {
            product = new SimpleConcreteProductB();
            //初始化设置product
        }
        return product;
    }

    //所有产品类的公共业务方法
    public void methodSame() {
        log.info("调用产品类的公共业务方法");
        //公共方法的实现
    }

    //声明抽象业务方法
    public abstract void methodDiff();
}
