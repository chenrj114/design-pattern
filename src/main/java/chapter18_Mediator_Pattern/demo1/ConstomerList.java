package chapter18_Mediator_Pattern.demo1;

/**
 * @ClassName ConstomerList
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 13:58
 * @Version 1.0
 */ //列表框类
class ConstomerList {
    private ComboBox cb;
    private TextBox tb;
	//......

    //界面组件的交互
    public void change() {
        cb.update();
        tb.update();
    }

    public void update() {
		//......
    }
	//......
}
