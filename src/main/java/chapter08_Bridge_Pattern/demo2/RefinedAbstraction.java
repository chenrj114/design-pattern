package chapter08_Bridge_Pattern.demo2;

/**
 * @ClassName RefinedAbstraction
 * @Description
 * @Author rjchen
 * @Date 2020-05-16 11:52
 * @Version 1.0
 */
public class RefinedAbstraction extends Abstraction {

    public void operation() {
        //业务代码
        impl.operationImpl();  //调用实现类的方法
        //业务代码
    }
}