package chapter07_Adapter_Pattern.demo1;

/**
 * @ClassName Adapter
 * @Description
 * @Author rjchen
 * @Date 2020-05-16 10:38
 * @Version 1.0
 */
public class Adapter implements Target {

    private Adaptee adaptee; //维持一个对适配者对象的引用

    public Adapter() {
        Adaptee adaptee = new Adaptee();
        this.adaptee = adaptee;
    }
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest(); //转发调用
    }
}