package chapter01_Simple_Factory_Pattern.demo2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ConcreteProductB extends Product {
    //实现业务方法
    public void methodDiff() {
        //业务方法的实现B
        log.info("ProductB的业务方法的实现");
    }
}
