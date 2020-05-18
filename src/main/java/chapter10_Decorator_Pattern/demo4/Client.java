package chapter10_Decorator_Pattern.demo4;

import org.junit.Test;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 14:07
 * @Version 1.0
 */

public class Client {

    /**
     * 如果newDoc也使用Document类型来定义，将导致客户端无法调用新增业务方法approve()，
     * 因为在抽象构件类Document中没有对approve()方法的声明。
     * 也就是说，在客户端无法统一对待装饰之前的具体构件对象和装饰之后的构件对象。
     */
    @Test
    public void test() {
        Document doc; //使用抽象构件类型定义
        doc = new PurchaseRequest();
        Approver newDoc; //使用具体装饰类型定义
        newDoc = new Approver(doc);
        newDoc.display();//调用原有业务方法
        newDoc.approve();//调用新增业务方法
    }
}
