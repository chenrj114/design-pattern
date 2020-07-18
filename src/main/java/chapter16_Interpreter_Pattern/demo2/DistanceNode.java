package chapter16_Interpreter_Pattern.demo2;

/**
 * @ClassName DistanceNode
 * @Description 距离解释：终结符表达式
 * @Author rjchen
 * @Date 2020/7/17 19:19
 * @Version 1.0
 */
class DistanceNode extends AbstractNode {
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    //距离表达式的解释操作
    public String interpret() {
        return this.distance;
    }
}
