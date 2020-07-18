package chapter16_Interpreter_Pattern.demo2;

/**
 * @ClassName SentenceNode
 * @Description   @Description
 * @Author rjchen
 * @Date 2020/7/17 19:19
 * @Version 1.0
 */ //
class SentenceNode extends AbstractNode {
    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction,AbstractNode action,AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    //简单句子的解释操作
    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
