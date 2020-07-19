package chapter21_State_Pattern.demo5;

/**
 * @ClassName NormalState
 * @Description 正常状态类
 * @Author rjchen
 * @Date 2020/7/19 11:20
 * @Version 1.0
 */
class NormalState extends State{
    public void display() {
        System.out.println("正常大小！");
    }
}
