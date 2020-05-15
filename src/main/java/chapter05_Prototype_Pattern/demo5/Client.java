package chapter05_Prototype_Pattern.demo5;

import org.junit.Test;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 11:08
 * @Version 1.0
 */
public class Client {

    @Test
    public void test() {
        // 获取原型管理器对象
        PrototypeManager pm = PrototypeManager.getPrototypeManager();
        OfficialDocument doc1,doc2,doc3,doc4;

        doc1 = pm.getOfficialDocument("far");
        doc1.display();
        doc2 = pm.getOfficialDocument("far");
        doc2.display();
        System.out.println(doc1 == doc2);

        doc3 = pm.getOfficialDocument("srs");
        doc3.display();
        doc4 = pm.getOfficialDocument("srs");
        doc4.display();
        System.out.println(doc3 == doc4);
    }
}
