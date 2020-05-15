package chapter05_Prototype_Pattern.demo1;

/**
 * @ClassName ConcretePrototype4J
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 9:56
 * @Version 1.0
 */
public class ConcretePrototype4J implements Cloneable{
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
            System.out.println("Not support cloneable");
        }
        return (Prototype) object;
    }
}
