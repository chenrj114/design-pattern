package chapter07_Adapter_Pattern.demo1;

import org.junit.Test;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020-05-16 10:40
 * @Version 1.0
 */
public class Client {

    @Test
    public void test() {
        Target target = new Adapter();
        target.request();
    }
}
