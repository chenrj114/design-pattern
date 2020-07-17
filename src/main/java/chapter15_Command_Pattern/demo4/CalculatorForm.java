package chapter15_Command_Pattern.demo4;

/**
 * @ClassName CalculatorForm
 * @Description 计算器界面类：请求发送者
 * @Author rjchen
 * @Date 2020/7/17 11:35
 * @Version 1.0
 */
class CalculatorForm {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    //调用命令对象的execute()方法执行运算
    public void compute(int value) {
        int i = command.execute(value);
        System.out.println("执行运算，运算结果为：" + i);
    }

    //调用命令对象的undo()方法执行撤销
    public void undo() {
        int i = command.undo();
        System.out.println("执行撤销，运算结果为：" + i);
    }
}
