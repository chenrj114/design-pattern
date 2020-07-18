package chapter16_Interpreter_Pattern.demo3;

/**
 * @ClassName LoopCommandNode
 * @Description 循环命令节点类：非终结符表达式
 * @Author rjchen
 * @Date 2020/7/18 9:41
 * @Version 1.0
 */
class LoopCommandNode extends Node {
    private int number; //循环次数
    private Node commandNode; //循环语句中的表达式

    //解释循环命令
    public void interpret(Context context) {
        context.skipToken("LOOP");
        number = context.currentNumber();
        context.nextToken();
        commandNode = new ExpressionNode(); //循环语句中的表达式
        commandNode.interpret(context);
    }

    public void execute() {
        for (int i=0;i<number;i++)
            commandNode.execute();
    }
}
