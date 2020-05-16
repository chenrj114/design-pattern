package chapter08_Bridge_Pattern.demo2;

/**
 * @ClassName Implementor
 * @Description 在具体编码实现时，由于在桥接模式中存在两个独立变化的维度，为了使两者之间耦合度降低，
 * 首先需要针对两个不同的维度提取抽象类和实现类接口，并建立一个抽象关联关系。对于“实现部分”维度，
 * 典型的实现类接口代码如下
 * @Author rjchen
 * @Date 2020-05-16 11:51
 * @Version 1.0
 */
public interface Implementor {
    public void operationImpl();
}
