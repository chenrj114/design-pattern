package chapter02_Factory_Method_Pattern.demo1;

/**
 * @ClassName LoggerFactory
 * @Description 当系统中需要引入新产品时，由于静态工厂方法通过所传入参数的不同来创建不同的产品，
 * 这必定要修改工厂类的源代码，将违背“开闭原则”
 * @Author rjchen
 * @Date 2020-05-12 20:43
 * @Version 1.0
 */
//日志记录器工厂
class LoggerFactory {
    //静态工厂方法
    public static Logger createLogger(String args) {
        /**
         * 工厂类过于庞大，包含了大量的if…else…代码，导致维护和测试难度增大；
         */
        if(args.equalsIgnoreCase("db")) {
            //连接数据库，代码省略
            //创建数据库日志记录器对象
            Logger logger = new DatabaseLogger();
            //初始化数据库日志记录器，代码省略
            return logger;
        }
        else if(args.equalsIgnoreCase("file")) {
            //创建日志文件
            //创建文件日志记录器对象
            Logger logger = new FileLogger();
            //初始化文件日志记录器，代码省略
            return logger;
        }
        else {
            return null;
        }
    }
}
