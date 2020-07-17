package chapter15_Command_Pattern.demo2;

/**
 * @ClassName WindowHanlder
 * @Description 窗口处理类：请求接收者
 * @Author rjchen
 * @Date 2020/7/17 10:12
 * @Version 1.0
 */
class WindowHanlder {
    public void minimize() {
        System.out.println("将窗口最小化至托盘！");
    }
}
