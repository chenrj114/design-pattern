package chapter16_Interpreter_Pattern.demo3;

/**
 * @ClassName CommandNode
 * @Description 语句命令节点类：非终结符表达式
 * @Author rjchen
 * @Date 2020/7/18 9:41
 * @Version 1.0
 */
class CommandNode extends Node {
    private Node node;

    public void interpret(Context context) {
        //处理LOOP循环命令
        if (context.currentToken().equals("LOOP")) {
            node = new LoopCommandNode();
            node.interpret(context);
        }
        //处理其他基本命令
        else {
            node = new PrimitiveCommandNode();
            node.interpret(context);
        }
    }

    public void execute() {
        node.execute();
    }
}
