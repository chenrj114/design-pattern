package chapter07_Adapter_Pattern.demo4;

import chapter07_Adapter_Pattern.demo1.Target;

/**
 * @ClassName Adapter
 * @Description 双向适配器: 适配者可以通过它调用目标类中的方法，目标类也可以通过它调用适配者类中的方法
 * @Author rjchen
 * @Date 2020-05-16 11:19
 * @Version 1.0
 */
public class Adapter implements Target,Adaptee {
    //同时维持对抽象目标类和适配者的引用
    private Target target;
    private Adaptee adaptee;

    public Adapter(Target target) {
        this.target = target;
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }

    public void specificRequest() {
        target.request();
    }
}