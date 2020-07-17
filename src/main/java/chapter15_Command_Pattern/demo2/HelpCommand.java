package chapter15_Command_Pattern.demo2;

/**
 * @ClassName HelpCommand
 * @Description 帮助命令类：具体命令类
 * @Author rjchen
 * @Date 2020/7/17 10:12
 * @Version 1.0
 */
class HelpCommand extends Command {
    private HelpHandler hhObj; //维持对请求接收者的引用

    public HelpCommand() {
        hhObj = new HelpHandler();
    }

    //命令执行方法，将调用请求接收者的业务方法
    public void execute() {
        hhObj.display();
    }
}
