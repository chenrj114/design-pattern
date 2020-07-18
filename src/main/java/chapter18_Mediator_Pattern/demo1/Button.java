package chapter18_Mediator_Pattern.demo1;

/**
 * @ClassName Button
 * @Description 按钮类
 * @Author rjchen
 * @Date 2020/7/18 13:57
 * @Version 1.0
 */

public class Button {
    private ConstomerList list;
    private ComboBox cb;
    private TextBox tb;
	//......

    //界面组件的交互
    public void change() {
        list.update();
        cb.update();
        tb.update();
    }

    public void update() {
		//......
    }
	//......
}

