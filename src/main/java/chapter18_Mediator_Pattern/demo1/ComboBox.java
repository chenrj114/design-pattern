package chapter18_Mediator_Pattern.demo1;

/**
 * @ClassName ComboBox
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 13:57
 * @Version 1.0
 */ //组合框类
class ComboBox {
    private ConstomerList list;
    private TextBox tb;
	//......

    //界面组件的交互
    public void change() {
        list.update();
        tb.update();
    }

    public void update() {
		//......
    }
	//......
}
