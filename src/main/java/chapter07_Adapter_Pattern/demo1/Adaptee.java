package chapter07_Adapter_Pattern.demo1;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName Adaptee
 * @Description
 * @Author rjchen
 * @Date 2020-05-16 10:39
 * @Version 1.0
 */
@Slf4j
public class Adaptee {

    public void specificRequest() {
        log.info("请求被Adaptee调用");
    }
}
