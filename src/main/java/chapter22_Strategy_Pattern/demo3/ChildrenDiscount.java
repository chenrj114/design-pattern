package chapter22_Strategy_Pattern.demo3;

/**
 * @ClassName ChildrenDiscount
 * @Description 儿童票折扣类：具体策略类
 * @Author rjchen
 * @Date 2020/7/19 12:10
 * @Version 1.0
 */
class ChildrenDiscount implements Discount {
    public double calculate(double price) {
        System.out.println("儿童票：");
        return price - 10;
    }
}
