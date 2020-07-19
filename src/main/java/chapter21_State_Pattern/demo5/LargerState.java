package chapter21_State_Pattern.demo5;

/**
 * @ClassName LargerState
 * @Description 二倍状态类
 * @Author rjchen
 * @Date 2020/7/19 11:20
 * @Version 1.0
 */
class LargerState extends State{
    public void display() {
        System.out.println("二倍大小！");
    }
}
