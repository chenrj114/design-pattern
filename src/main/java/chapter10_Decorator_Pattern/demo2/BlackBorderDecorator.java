package chapter10_Decorator_Pattern.demo2;

/**
 * @ClassName BlackBorderDecorator
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 12:54
 * @Version 1.0
 */
//黑色边框装饰类：具体装饰类
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框！");
    }
}
