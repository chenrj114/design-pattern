package chapter06_Builder_Pattern.demo3;

import chapter06_Builder_Pattern.demo2.Actor;
import chapter06_Builder_Pattern.demo2.XMLUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 14:03
 * @Version 1.0
 */
@Slf4j
public class Client {

    @Test
    public void test() {
        ActorBuilder ab;
        ab = (ActorBuilder) XMLUtil.getBean();

        Actor actor;
        actor = ActorBuilder.construct(ab);
        log.info(actor.toString());
    }
}
