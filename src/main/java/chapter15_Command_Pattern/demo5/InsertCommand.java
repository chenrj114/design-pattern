package chapter15_Command_Pattern.demo5;

/**
 * @ClassName InsertCommand
 * @Description 增加命令类：具体命令
 * @Author rjchen
 * @Date 2020/7/17 16:16
 * @Version 1.0
 */

class InsertCommand extends Command {
    public InsertCommand(String name) {
        super(name);
    }

    public void execute(String args) {
        this.args = args;
        configOperator.insert(args);
    }

    public void execute() {
        configOperator.insert(this.args);
    }
}
