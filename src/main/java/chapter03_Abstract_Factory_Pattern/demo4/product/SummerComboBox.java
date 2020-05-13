package chapter03_Abstract_Factory_Pattern.demo4.product;

/**
 * @ClassName SpringComboBox
 * @Description
 * @Author rjchen
 * @Date 2020-05-13 14:04
 * @Version 1.0
 */
public class SummerComboBox implements ComboBox{
    @Override
    public void display() {
        System.out.println("显示蓝色边框组合框。");
    }
}
