package chapter01_Simple_Factory_Pattern.demo2;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName Product
 * @Description  在使用简单工厂模式时，首先需要对产品类进行重构，不能设计一个包罗万象的产品类，
 * 而需根据实际情况设计一个产品层次结构，将所有产品类公共的代码移至抽象产品类
 * @Author rjchen
 * @Date 2020-05-12 18:42
 * @Version 1.0
 */
@Slf4j
public abstract class Product {
    //所有产品类的公共业务方法
    public void methodSame() {
        log.info("调用产品类的公共业务方法");
        //公共方法的实现
    }

    //声明抽象业务方法
    public abstract void methodDiff();
}
