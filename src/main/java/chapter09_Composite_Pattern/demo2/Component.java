package chapter09_Composite_Pattern.demo2;

/**
 * @ClassName Component
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 11:33
 * @Version 1.0
 */
public abstract class Component {
    public abstract void add(Component c); //增加成员
    public abstract void remove(Component c); //删除成员
    public abstract Component getChild(int i); //获取成员
    public abstract void operation();  //业务方法
}
