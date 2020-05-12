package chapter02_Factory_Method_Pattern.demo6;

import chapter02_Factory_Method_Pattern.demo3.Logger;

/**
 * @ClassName LoggerFactory
 * @Description 还可以对客户端隐藏工厂方法，此时，在工厂类中将直接调用产品类的业务方法，
 * 客户端无须调用工厂方法创建产品，直接通过工厂即可使用所创建的对象中的业务方法
 * @Author rjchen
 * @Date 2020-05-12 21:21
 * @Version 1.0
 */
abstract class LoggerFactory {
    public void writeLog() {
        Logger logger = this.createLogger();
        logger.writeLog();
    }

    public abstract Logger createLogger();
}
