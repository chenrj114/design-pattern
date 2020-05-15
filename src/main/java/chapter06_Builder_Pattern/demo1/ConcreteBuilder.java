package chapter06_Builder_Pattern.demo1;

/**
 * @ClassName ConcreteBuilder
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 11:52
 * @Version 1.0
 */
public class ConcreteBuilder extends Builder {

    @Override
    public void buildPartA() {
        product.setPartA("ConcreteBuilder建造partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("ConcreteBuilder建造partB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("ConcreteBuilder建造partC");
    }
}
