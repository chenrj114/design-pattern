package chapter16_Interpreter_Pattern.demo2;

/**
 * @ClassName DirectionNode
 * @Description 方向解释：终结符表达式
 * @Author rjchen
 * @Date 2020/7/17 19:19
 * @Version 1.0
 */
class DirectionNode extends AbstractNode {
    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    //方向表达式的解释操作
    public String interpret() {
        if (direction.equalsIgnoreCase("up")) {
            return "向上";
        }
        else if (direction.equalsIgnoreCase("down")) {
            return "向下";
        }
        else if (direction.equalsIgnoreCase("left")) {
            return "向左";
        }
        else if (direction.equalsIgnoreCase("right")) {
            return "向右";
        }
        else {
            return "无效指令";
        }
    }
}
