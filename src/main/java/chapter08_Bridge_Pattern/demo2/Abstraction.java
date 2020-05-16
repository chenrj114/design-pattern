package chapter08_Bridge_Pattern.demo2;

/**
 * @ClassName Abstraction
 * @Description  在抽象类Abstraction中定义了一个实现类接口类型的成员对象impl，
 * 再通过注入的方式给该对象赋值，一般将该对象的可见性定义为protected，以便在其子类中访问Implementor的方法
 * @Author rjchen
 * @Date 2020-05-16 11:51
 * @Version 1.0
 */
public abstract class Abstraction {

    protected Implementor impl; //定义实现类接口对象

    public void setImpl(Implementor impl) {
        this.impl=impl;
    }

    public abstract void operation();  //声明抽象业务方法

}