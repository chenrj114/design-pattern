package chapter06_Builder_Pattern.demo1;

/**
 * @ClassName Builder
 * @Description 在抽象建造者类中定义了产品的创建方法和返回方法
 * @Author rjchen
 * @Date 2020-05-15 11:45
 * @Version 1.0
 */
public abstract class Builder {
    //创建产品对象
    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    //返回产品对象
    public Product getResult() {
        return product;
    }
}
