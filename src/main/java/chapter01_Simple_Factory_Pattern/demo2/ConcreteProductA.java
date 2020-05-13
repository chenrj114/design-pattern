package chapter01_Simple_Factory_Pattern.demo2;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName ConcreteProduct
 * @Description  在具体产品类中实现了抽象产品类中声明的抽象业务方法，
 * 不同的具体产品类可以提供不同的实现
 * @Author rjchen
 * @Date 2020-05-12 18:43
 * @Version 1.0
 */
@Slf4j
class ConcreteProductA extends Product {
    //实现业务方法
    public void methodDiff() {
        //业务方法的实现
        log.info("ProductA的业务方法的实现");
    }
}
