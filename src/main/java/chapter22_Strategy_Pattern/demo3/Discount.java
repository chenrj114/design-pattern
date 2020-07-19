package chapter22_Strategy_Pattern.demo3;

/**
 * @ClassName Discount
 * @Description 折扣类：抽象策略类
 * @Author rjchen
 * @Date 2020/7/19 12:10
 * @Version 1.0
 */
interface Discount {
    public double calculate(double price);
}
