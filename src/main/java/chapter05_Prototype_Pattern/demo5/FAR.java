package chapter05_Prototype_Pattern.demo5;

/**
 * @ClassName FAR
 * @Description 可行性分析报告(Feasibility Analysis Report)类
 * @Author rjchen
 * @Date 2020-05-15 10:59
 * @Version 1.0
 */
public class FAR implements OfficialDocument, Cloneable {

    @Override
    public OfficialDocument clone() {
        OfficialDocument far = null;
        try {
            far = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
        }
        return far;
    }

    @Override
    public void display() {
        System.out.println("《可行性分析报告》");
    }
}
