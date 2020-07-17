package chapter15_Command_Pattern.demo2;

import chapter15_Command_Pattern.XMLUtil;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020/7/17 10:18
 * @Version 1.0
 */

public class Client {

    public static void main(String args[]) {

        FBSettingWindow fbsw = new FBSettingWindow("功能键设置");

        FunctionButton fb1,fb2;
        fb1 = new FunctionButton("功能键1");
        fb2 = new FunctionButton("功能键1");

        Command command1,command2;
        //通过读取配置文件和反射生成具体命令对象
        command1 = (Command) XMLUtil.getBean(0);
        command2 = (Command) XMLUtil.getBean(1);

        //将命令对象注入功能键
        fb1.setCommand(command1);
        fb2.setCommand(command2);

        fbsw.addFunctionButton(fb1);
        fbsw.addFunctionButton(fb2);
        fbsw.display();

        //调用功能键的业务方法
        fb1.onClick();
        fb2.onClick();
    }
}
