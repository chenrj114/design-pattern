package chapter21_State_Pattern.demo4;

/**
 * @ClassName OffState
 * @Description 关闭状态
 * @Author rjchen
 * @Date 2020/7/19 10:38
 * @Version 1.0
 */
class OffState extends State {

    public void on(Switch s) {
        System.out.println("打开！");
        s.setState(Switch.getState("on"));
    }

    public void off(Switch s) {
        System.out.println("已经关闭！");
    }
}
