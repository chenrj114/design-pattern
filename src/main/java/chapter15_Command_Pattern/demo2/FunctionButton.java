package chapter15_Command_Pattern.demo2;

/**
 * @ClassName FunctionButton
 * @Description 功能键类：请求发送者
 * @Author rjchen
 * @Date 2020/7/17 10:12
 * @Version 1.0
 */
class FunctionButton {

    private String name; //功能键名称
    private Command command; //维持一个抽象命令对象的引用

    public FunctionButton(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //为功能键注入命令
    public void setCommand(Command command) {
        this.command = command;
    }

    //发送请求的方法
    public void onClick() {
        System.out.print("点击功能键：");
        command.execute();
    }
}
