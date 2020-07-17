package chapter15_Command_Pattern.demo3;

import chapter15_Command_Pattern.demo1.Command;

import java.util.ArrayList;

/**
 * @ClassName CommandQueue
 * @Description
 * @Author rjchen
 * @Date 2020/7/17 11:14
 * @Version 1.0
 */

public class CommandQueue {

    //定义一个ArrayList来存储命令队列
    private ArrayList<Command> commands = new ArrayList<Command>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    //循环调用每一个命令对象的execute()方法
    public void execute() {
        for (Object command : commands) {
            ((Command)command).execute();
        }
    }
}
