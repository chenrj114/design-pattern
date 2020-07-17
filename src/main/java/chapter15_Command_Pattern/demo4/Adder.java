package chapter15_Command_Pattern.demo4;

/**
 * @ClassName Adder
 * @Description 加法类：请求接收者
 * @Author rjchen
 * @Date 2020/7/17 11:35
 * @Version 1.0
 */

public class Adder {
    private int num=0; //定义初始值为0

    //加法操作，每次将传入的值与num作加法运算，再将结果返回
    public int add(int value) {
        num += value;
        return num;
    }
}

