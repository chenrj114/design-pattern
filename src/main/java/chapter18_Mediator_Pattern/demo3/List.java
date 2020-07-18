package chapter18_Mediator_Pattern.demo3;

/**
 * @ClassName List
 * @Description 列表框类：具体同事类
 * @Author rjchen
 * @Date 2020/7/18 14:06
 * @Version 1.0
 */
public class List extends Component {
    public void update() {
        System.out.println("列表框增加一项：张无忌。");
    }

    public void select() {
        System.out.println("列表框选中项：小龙女。");
    }
}
