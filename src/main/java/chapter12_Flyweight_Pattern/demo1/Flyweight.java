package chapter12_Flyweight_Pattern.demo1;

/**
 * @ClassName Flyweight
 * @Description
 * @Author rjchen
 * @Date 2020-07-04 15:16
 * @Version 1.0
 */

public class Flyweight {

    //内部状态intrinsicState作为成员变量，同一个享元对象其内部状态是一致的
    private final String intrinsicState;

    public Flyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    public Flyweight() {
        intrinsicState = null;
    }

    //外部状态extrinsicState在使用时由外部设置，不保存在享元对象中，即使是同一个对象，在每一次调用时也可以传入不同的外部状态
    public void operation(String extrinsicState) {
    }

}
