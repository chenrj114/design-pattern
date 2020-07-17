package chapter15_Command_Pattern.demo1;

/**
 * @ClassName Invoker
 * @Description
 * @Author rjchen
 * @Date 2020/7/17 10:05
 * @Version 1.0
 */

public class Invoker {
    private Command command;

    //构造注入
    public Invoker(Command command) {
        this.command = command;
    }

    //设值注入
    public void setCommand(Command command) {
        this.command = command;
    }

    //业务方法，用于调用命令类的execute()方法
    public void call() {
        command.execute();
    }
}