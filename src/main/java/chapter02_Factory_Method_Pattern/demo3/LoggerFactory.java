package chapter02_Factory_Method_Pattern.demo3;

/**
 * @ClassName LoggerFactory
 * @Description 当系统中需要引入新产品时，由于静态工厂方法通过所传入参数的不同来创建不同的产品，
 * 这必定要修改工厂类的源代码，将违背“开闭原则”
 * @Author rjchen
 * @Date 2020-05-12 20:43
 * @Version 1.0
 */
//日志记录器工厂
interface LoggerFactory {
    //静态工厂方法
    public Logger createLogger();
}
