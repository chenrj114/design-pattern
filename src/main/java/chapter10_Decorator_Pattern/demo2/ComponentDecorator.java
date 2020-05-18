package chapter10_Decorator_Pattern.demo2;

/**
 * @ClassName ComponentDecorator
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 12:54
 * @Version 1.0
 */
//构件装饰类：抽象装饰类
public class ComponentDecorator extends Component {
    private final Component component; //维持对抽象构件类型对象的引用

    public ComponentDecorator(Component component) //注入抽象构件类型的对象
    {
        this.component = component;
    }

    public void display() {
        component.display();
    }
}
