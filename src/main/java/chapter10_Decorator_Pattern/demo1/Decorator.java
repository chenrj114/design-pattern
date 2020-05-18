package chapter10_Decorator_Pattern.demo1;

/**
 * @ClassName Decorator
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 12:45
 * @Version 1.0
 */
public class Decorator implements Component {

    private final Component component; //维持一个对抽象构件对象的引用

    //注入一个抽象构件类型的对象
    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation(); //调用原有业务方法
    }
}
