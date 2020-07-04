package chapter12_Flyweight_Pattern.demo1;

/**
 * @ClassName ConcreteFlyweight
 * @Description
 * @Author rjchen
 * @Date 2020-07-04 18:16
 * @Version 1.0
 */

public class ConcreteFlyweight extends Flyweight {

    public ConcreteFlyweight(String intrinsicState) {
        super(intrinsicState);
    }

    public ConcreteFlyweight() {
        super();
    }
}
