package chapter18_Mediator_Pattern.demo3;

/**
 * @ClassName ComboBox
 * @Description 组合框类：具体同事类
 * @Author rjchen
 * @Date 2020/7/18 14:06
 * @Version 1.0
 */
public class ComboBox extends Component {
    public void update() {
        System.out.println("组合框增加一项：张无忌。");
    }

    public void select() {
        System.out.println("组合框选中项：小龙女。");
    }
}
