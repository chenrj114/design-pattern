package chapter10_Decorator_Pattern.demo4;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName Approver
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 14:05
 * @Version 1.0
 */
@Slf4j
public class Approver extends Decorator {

    public Approver(Document document) {
        super(document);
        log.info("增加审批功能");
    }

    public  void approve() {
        log.info("审批文件");
    }
}
