package chapter10_Decorator_Pattern.demo1;

/**
 * @ClassName ConcreteDecorator
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 12:47
 * @Version 1.0
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    public void operation() {
        super.operation(); //调用原有业务方法
        addedBehavior(); //调用新增业务方法
    }

    //新增业务方法
    public void addedBehavior() {
    }
}