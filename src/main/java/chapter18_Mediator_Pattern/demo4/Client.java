package chapter18_Mediator_Pattern.demo4;

import chapter18_Mediator_Pattern.demo3.Button;
import chapter18_Mediator_Pattern.demo3.ComboBox;
import chapter18_Mediator_Pattern.demo3.List;
import chapter18_Mediator_Pattern.demo3.TextBox;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 14:29
 * @Version 1.0
 */

class Client {
    public static void main(String args[]) {
        //用新增具体中介者定义中介者对象
        SubConcreteMediator mediator;
        mediator = new SubConcreteMediator();

        Button addBT = new Button();
        List list = new List();
        ComboBox cb = new ComboBox();
        TextBox userNameTB = new TextBox();
        Label label = new Label();

        addBT.setMediator(mediator);
        list.setMediator(mediator);
        cb.setMediator(mediator);
        userNameTB.setMediator(mediator);
        label.setMediator(mediator);

        mediator.addButton = addBT;
        mediator.list = list;
        mediator.cb = cb;
        mediator.userNameTextBox = userNameTB;
        mediator.label = label;

        addBT.changed();
        System.out.println("-----------------------------");
        list.changed();
    }
}
