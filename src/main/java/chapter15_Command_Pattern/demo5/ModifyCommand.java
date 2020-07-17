package chapter15_Command_Pattern.demo5;

/**
 * @ClassName ModifyCommand
 * @Description 修改命令类：具体命令
 * @Author rjchen
 * @Date 2020/7/17 16:16
 * @Version 1.0
 */

class ModifyCommand extends Command {
    public ModifyCommand(String name) {
        super(name);
    }

    public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }

    public void execute() {
        configOperator.modify(this.args);
    }
}
