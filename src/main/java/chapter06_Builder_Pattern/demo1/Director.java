package chapter06_Builder_Pattern.demo1;

/**
 * @ClassName Director
 * @Description 引入了一个指挥者类Director
 * 一方面它隔离了客户与创建过程；另一方面它控制产品的创建过程
 *
 * 在实际生活中也存在类似指挥者一样的角色，如一个客户去购买电脑，电脑销售人员相当于指挥者，
 * 只要客户确定电脑的类型，电脑销售人员可以通知电脑组装人员给客户组装一台电脑。
 *
 * @Author rjchen
 * @Date 2020-05-15 11:50
 * @Version 1.0
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder=builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    //产品构建与组装方法
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
