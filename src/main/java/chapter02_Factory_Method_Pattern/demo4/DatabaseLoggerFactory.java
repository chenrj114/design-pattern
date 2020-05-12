package chapter02_Factory_Method_Pattern.demo4;

import chapter02_Factory_Method_Pattern.demo3.DatabaseLogger;
import chapter02_Factory_Method_Pattern.demo3.Logger;

/**
 * @ClassName DatabaseLoggerFactory
 * @Description发现可以通过多种方式来初始化日志记录器，例如可以为各种日志记录器提供默认实现；
 * 还可以为数据库日志记录器提供数据库连接字符串，
 * 为文件日志记录器提供文件路径；
 * 也可以将参数封装在一个Object类型的对象中，
 * 通过Object对象将配置参数传入工厂类
 *
 * 在抽象工厂中定义多个重载的工厂方法，在具体工厂中实现了这些工厂方法，
 * 这些方法可以包含不同的业务逻辑，以满足对不同产品对象的需求。
 *
 * @Author rjchen
 * @Date 2020-05-12 21:13
 * @Version 1.0
 */
public class DatabaseLoggerFactory implements LoggerFactory{


    @Override
    public Logger createLogger() {
        // 使用默认方式连接数据库，代码省略
        return new DatabaseLogger();
    }

    @Override
    public Logger createLogger(String args) {
        //使用参数args作为连接字符串来连接数据库，代码省略
        Logger logger = new DatabaseLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }

    @Override
    public Logger createLogger(Object obj) {
        //使用封装在参数obj中的连接字符串来连接数据库，代码省略
        Logger logger = new DatabaseLogger();
        //使用封装在参数obj中的数据来初始化数据库日志记录器，代码省略
        return logger;
    }
}
