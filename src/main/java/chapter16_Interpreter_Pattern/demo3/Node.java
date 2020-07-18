package chapter16_Interpreter_Pattern.demo3;

/**
 * @ClassName Node
 * @Description 抽象节点类：抽象表达式
 * @Author rjchen
 * @Date 2020/7/18 9:41
 * @Version 1.0
 */
abstract class Node {
    public abstract void interpret(Context text); //声明一个方法用于解释语句
    public abstract void execute(); //声明一个方法用于执行标记对应的命令
}
