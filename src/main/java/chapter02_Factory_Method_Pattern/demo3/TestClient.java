package chapter02_Factory_Method_Pattern.demo3;

import org.junit.Test;

/**
 * @ClassName TestClient
 * @Description
 * @Author rjchen
 * @Date 2020-05-12 21:10
 * @Version 1.0
 */
public class TestClient {

    @Test
    public void test() {
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory(); //可引入配置文件实现
        logger = factory.createLogger();
        logger.writeLog();
    }
}
