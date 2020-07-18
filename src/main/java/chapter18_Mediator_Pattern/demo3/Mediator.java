package chapter18_Mediator_Pattern.demo3;

/**
 * @ClassName Mediator
 * @Description 抽象中介者
 * @Author rjchen
 * @Date 2020/7/18 14:05
 * @Version 1.0
 */


abstract class Mediator {
    public abstract void componentChanged(Component c);
}

