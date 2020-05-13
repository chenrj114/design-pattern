package chapter03_Abstract_Factory_Pattern.demo3;

import chapter03_Abstract_Factory_Pattern.demo3.product.AbstractProductA;
import chapter03_Abstract_Factory_Pattern.demo3.product.AbstractProductB;
import chapter03_Abstract_Factory_Pattern.demo3.product.ConcreteProductA1;
import chapter03_Abstract_Factory_Pattern.demo3.product.ConcreteProductB1;

/**
 * @ClassName ConcreteFactory1
 * @Description
 * @Author rjchen
 * @Date 2020-05-13 13:35
 * @Version 1.0
 */
class ConcreteFactory1 extends AbstractFactory {
    //工厂方法一
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    //工厂方法二
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
