package chapter01_Simple_Factory_Pattern.demo4;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName SimpleConcreteProduct
 * @Description
 * @Author rjchen
 * @Date 2020-05-12 19:23
 * @Version 1.0
 */
@Slf4j
public class SimpleConcreteProductA extends SimpleProduct {

    @Override
    public void methodDiff() {
        log.info("调用SimpleConcreteProductA的业务实现方法");
    }
}
