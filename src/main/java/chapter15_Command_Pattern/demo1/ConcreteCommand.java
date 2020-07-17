package chapter15_Command_Pattern.demo1;

/**
 * @ClassName ConcreteCommand
 * @Description
 * @Author rjchen
 * @Date 2020/7/17 10:08
 * @Version 1.0
 */

public class ConcreteCommand extends Command {
    private Receiver receiver; //维持一个对请求接收者对象的引用

    public void execute() {
        receiver.action(); //调用请求接收者的业务处理方法action()
    }
}
