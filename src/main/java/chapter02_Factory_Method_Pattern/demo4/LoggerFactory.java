package chapter02_Factory_Method_Pattern.demo4;

import chapter02_Factory_Method_Pattern.demo3.Logger;

/**
 * @ClassName LoggerFactory
 * @Description
 * @Author rjchen
 * @Date 2020-05-12 21:13
 * @Version 1.0
 */
public interface LoggerFactory {
    public Logger createLogger();
    public Logger createLogger(String args);
    public Logger createLogger(Object obj);
}
