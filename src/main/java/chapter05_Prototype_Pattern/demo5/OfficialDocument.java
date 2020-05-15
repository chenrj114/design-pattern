package chapter05_Prototype_Pattern.demo5;

/**
 * @ClassName OfficialDocument
 * @Description 抽象公文接口，也可定义为抽象类，提供clone()方法的实现，将业务方法声明为抽象方法
 * @Author rjchen
 * @Date 2020-05-15 10:57
 * @Version 1.0
 */
public interface OfficialDocument {
    public  OfficialDocument clone();
    public  void display();
}
