package chapter03_Abstract_Factory_Pattern.demo4;

import chapter03_Abstract_Factory_Pattern.demo4.product.Button;
import chapter03_Abstract_Factory_Pattern.demo4.product.ComboBox;
import chapter03_Abstract_Factory_Pattern.demo4.product.TextField;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020-05-13 14:10
 * @Version 1.0
 */
public class Client {
    public static void main(String args[]) {
        //使用抽象层定义
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;

        factory = (SkinFactory)XMLUtil.getBean();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();

        bt.display();
        tf.display();
        cb.display();
    }
}