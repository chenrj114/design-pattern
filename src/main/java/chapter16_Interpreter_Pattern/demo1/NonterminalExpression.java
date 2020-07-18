package chapter16_Interpreter_Pattern.demo1;

/**
 * @ClassName NonterminalExpression
 * @Description
 * @Author rjchen
 * @Date 2020/7/17 19:16
 * @Version 1.0
 */

public class NonterminalExpression extends AbstractExpression {

    private final AbstractExpression left;
    private final AbstractExpression right;


    public NonterminalExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;

    }

    public void interpret(Context ctx) {
        //递归调用每一个组成部分的interpret()方法
        //在递归调用时指定组成部分的连接方式，即非终结符的功能
    }
}
