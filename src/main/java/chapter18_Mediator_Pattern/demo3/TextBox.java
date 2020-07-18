package chapter18_Mediator_Pattern.demo3;

/**
 * @ClassName TextBox
 * @Description 文本框类：具体同事类
 * @Author rjchen
 * @Date 2020/7/18 14:06
 * @Version 1.0
 */
public class TextBox extends Component {
    public void update() {
        System.out.println("客户信息增加成功后文本框清空。");
    }

    public void setText() {
        System.out.println("文本框显示：小龙女。");
    }
}
