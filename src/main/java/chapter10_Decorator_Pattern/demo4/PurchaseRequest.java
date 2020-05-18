package chapter10_Decorator_Pattern.demo4;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName PurchaseRequest
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 14:09
 * @Version 1.0
 */
@Slf4j
public class PurchaseRequest implements Document{

    @Override
    public void display() {
        log.info("显示采购请求");
    }
}
