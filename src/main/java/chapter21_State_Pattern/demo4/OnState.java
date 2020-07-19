package chapter21_State_Pattern.demo4;

/**
 * @ClassName OnState
 * @Description 打开状态
 * @Author rjchen
 * @Date 2020/7/19 10:38
 * @Version 1.0
 */
class OnState extends State {

    public void on(Switch s) {
        System.out.println("已经打开！");
    }

    public void off(Switch s) {
        System.out.println("关闭！");
        s.setState(Switch.getState("off"));
    }
}
