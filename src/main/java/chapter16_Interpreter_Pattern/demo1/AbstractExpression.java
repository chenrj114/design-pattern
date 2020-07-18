package chapter16_Interpreter_Pattern.demo1;

/**
 * @ClassName AbstractExpression
 * @Description
 * @Author rjchen
 * @Date 2020/7/17 19:15
 * @Version 1.0
 */

public abstract class AbstractExpression {
    public  abstract void interpret(Context ctx);
}
