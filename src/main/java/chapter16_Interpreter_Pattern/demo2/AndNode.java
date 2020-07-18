package chapter16_Interpreter_Pattern.demo2;

/**
 * @ClassName AndNode
 * @Description And解释：非终结符表达式
 * @Author rjchen
 * @Date 2020/7/17 19:19
 * @Version 1.0
 */
class AndNode extends AbstractNode {
    private AbstractNode left; //And的左表达式
    private AbstractNode right; //And的右表达式

    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    //And表达式解释操作
    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}
