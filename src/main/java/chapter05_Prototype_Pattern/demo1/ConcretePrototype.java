package chapter05_Prototype_Pattern.demo1;

/**
 * @ClassName ConcretePrototype
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 9:43
 * @Version 1.0
 */
public class ConcretePrototype implements Prototype {

    private String attr; //成员属性

    @Override
    public Prototype clone() { // 克隆方法
        Prototype prototype = new ConcretePrototype(); //创建新对象
        prototype.setAttr(this.attr);
        return prototype;
    }

    @Override
    public void setAttr(String attr) {
        this.attr = attr;
    }

    public String getAttr() {
        return this.attr;
    }
}