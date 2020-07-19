package chapter22_Strategy_Pattern.demo3;

/**
 * @ClassName VIPDiscount
 * @Description VIP会员票折扣类：具体策略类
 * @Author rjchen
 * @Date 2020/7/19 12:10
 * @Version 1.0
 */
class VIPDiscount implements Discount {
    public double calculate(double price) {
        System.out.println("VIP票：");
        System.out.println("增加积分！");
        return price * 0.5;
    }
}
