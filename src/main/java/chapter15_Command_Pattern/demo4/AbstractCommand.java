package chapter15_Command_Pattern.demo4;

/**
 * @ClassName AbstractCommand
 * @Description 抽象命令类
 * @Author rjchen
 * @Date 2020/7/17 11:35
 * @Version 1.0
 */
abstract class AbstractCommand {
    public abstract int execute(int value); //声明命令执行方法execute()
    public abstract int undo(); //声明撤销方法undo()
}
