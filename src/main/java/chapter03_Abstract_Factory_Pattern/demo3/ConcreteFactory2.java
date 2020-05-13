package chapter03_Abstract_Factory_Pattern.demo3;

import chapter03_Abstract_Factory_Pattern.demo3.product.AbstractProductA;
import chapter03_Abstract_Factory_Pattern.demo3.product.AbstractProductB;
import chapter03_Abstract_Factory_Pattern.demo3.product.ConcreteProductA2;
import chapter03_Abstract_Factory_Pattern.demo3.product.ConcreteProductB2;

/**
 * @ClassName ConcreteFactory2
 * @Description
 * @Author rjchen
 * @Date 2020-05-13 13:52
 * @Version 1.0
 */
public class ConcreteFactory2 extends AbstractFactory{

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
