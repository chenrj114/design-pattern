package chapter22_Strategy_Pattern.demo3;

/**
 * @ClassName StudentDiscount
 * @Description 学生票折扣类：具体策略类
 * @Author rjchen
 * @Date 2020/7/19 12:10
 * @Version 1.0
 */
class StudentDiscount implements Discount {
    public double calculate(double price) {
        System.out.println("学生票：");
        return price * 0.8;
    }
}
