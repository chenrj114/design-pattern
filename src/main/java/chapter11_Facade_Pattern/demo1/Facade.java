package chapter11_Facade_Pattern.demo1;

/**
 * @ClassName Facade
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 15:42
 * @Version 1.0
 */

public class Facade {

    private final SubSystemA obj1 = new SubSystemA();
    private final SubSystemB obj2 = new SubSystemB();
    private final SubSystemC obj3 = new SubSystemC();

    public void Method() {
        obj1.MethodA();
        obj2.MethodB();
        obj3.MethodC();
    }
}