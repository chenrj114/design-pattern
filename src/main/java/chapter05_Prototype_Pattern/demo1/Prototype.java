package chapter05_Prototype_Pattern.demo1;

/**
 * @ClassName Prototype
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 9:43
 * @Version 1.0
 */
public interface Prototype {
    public Prototype clone();

    void setAttr(String attr);
}
