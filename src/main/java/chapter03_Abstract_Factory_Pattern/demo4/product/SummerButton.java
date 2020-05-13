package chapter03_Abstract_Factory_Pattern.demo4.product;

/**
 * @ClassName SpringButton
 * @Description
 * @Author rjchen
 * @Date 2020-05-13 13:59
 * @Version 1.0
 */
public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮。");
    }
}
