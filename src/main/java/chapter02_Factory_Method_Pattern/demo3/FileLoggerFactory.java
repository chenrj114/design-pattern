package chapter02_Factory_Method_Pattern.demo3;

/**
 * @ClassName FileLoggerFactory
 * @Description
 * @Author rjchen
 * @Date 2020-05-12 21:08
 * @Version 1.0
 */
class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}