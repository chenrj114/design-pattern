package chapter10_Decorator_Pattern.demo2;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 13:59
 * @Version 1.0
 */

public class Client
{
    public static void main(String args[])
    {
        Component component,componentSB; //使用抽象构件定义
        component = new Window(); //定义具体构件
        componentSB = new ScrollBarDecorator(component); //定义装饰后的构件
        componentSB.display();
    }
}