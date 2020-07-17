package chapter15_Command_Pattern.demo3;

/**
 * @ClassName Invoker
 * @Description
 * @Author rjchen
 * @Date 2020/7/17 11:15
 * @Version 1.0
 */

public class Invoker {

    private CommandQueue commandQueue; //维持一个CommandQueue对象的引用

    //构造注入
    public Invoker(CommandQueue commandQueue) {
        this. commandQueue = commandQueue;
    }

    //设值注入
    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    //调用CommandQueue类的execute()方法
    public void call() {
        commandQueue.execute();
    }
}
