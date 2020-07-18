package chapter16_Interpreter_Pattern.demo2;

/**
 * @ClassName AbstractNode
 * @Description
 * @Author rjchen
 * @Date 2020/7/17 19:18
 * @Version 1.0
 */

//注：本实例对机器人控制指令的输出结果进行模拟，将英文指令翻译为中文指令，实际情况是调用不同的控制程序进行机器人的控制，包括对移动方向、方式和距离的控制等

//抽象表达式
abstract class AbstractNode {
    public abstract String interpret();
}

