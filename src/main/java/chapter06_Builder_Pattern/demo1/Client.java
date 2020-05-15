package chapter06_Builder_Pattern.demo1;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 11:54
 * @Version 1.0
 */
@Slf4j
public class Client {

    @Test
    public void test() {
        // 可以通过配置文件来存储具体建造者类ConcreteBuilder的类名
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        log.info(product.toString());
    }
}
