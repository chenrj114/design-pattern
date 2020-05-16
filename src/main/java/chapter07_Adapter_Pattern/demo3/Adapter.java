package chapter07_Adapter_Pattern.demo3;

import chapter07_Adapter_Pattern.demo1.Adaptee;
import chapter07_Adapter_Pattern.demo1.Target;


/**
 * @ClassName Adapter
 * @Description 根据类适配器模式结构图，适配器类实现了抽象目标类接口Target，并继承了适配者类，
 * 在适配器类的request()方法中调用所继承的适配者类的specificRequest()方法，实现了适配。
 * @Author rjchen
 * @Date 2020-05-16 11:05
 * @Version 1.0
 */
public class Adapter extends Adaptee implements Target {

    public void request() {
        specificRequest();
    }
}