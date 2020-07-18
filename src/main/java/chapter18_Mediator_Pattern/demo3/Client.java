package chapter18_Mediator_Pattern.demo3;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 14:14
 * @Version 1.0
 */

class Client {

    public static void main(String args[]) {
        //定义中介者对象
        ConcreteMediator mediator;
        mediator = new ConcreteMediator();

        //定义同事对象
        Button addBT = new Button();
        List list = new List();
        ComboBox cb = new ComboBox();
        TextBox userNameTB = new TextBox();

        addBT.setMediator(mediator);
        list.setMediator(mediator);
        cb.setMediator(mediator);
        userNameTB.setMediator(mediator);

        mediator.addButton = addBT;
        mediator.list = list;
        mediator.cb = cb;
        mediator.userNameTextBox = userNameTB;

        addBT.changed();
        System.out.println("-----------------------------");
        list.changed();
    }
}
