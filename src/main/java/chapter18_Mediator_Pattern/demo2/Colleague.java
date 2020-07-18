package chapter18_Mediator_Pattern.demo2;

/**
 * @ClassName Colleague
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 14:04
 * @Version 1.0
 */
abstract class Colleague {
    protected Mediator mediator; //维持一个抽象中介者的引用

    public Colleague(Mediator mediator) {
        this.mediator=mediator;
    }

    public abstract void method1(); //声明自身方法，处理自己的行为

    //定义依赖方法，与中介者进行通信
    public void method2() {
        mediator.operation();
    }
}
