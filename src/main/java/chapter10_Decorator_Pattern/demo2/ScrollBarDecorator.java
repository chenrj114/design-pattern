package chapter10_Decorator_Pattern.demo2;

/**
 * @ClassName ScrollBarDecorator
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 12:54
 * @Version 1.0
 */
//滚动条装饰类：具体装饰类
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }
}
