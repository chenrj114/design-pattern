package chapter16_Interpreter_Pattern.demo2;

/**
 * @ClassName ActionNode
 * @Description
 * @Author rjchen
 * @Date 2020/7/17 19:19
 * @Version 1.0
 */
class ActionNode extends AbstractNode {
    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    //动作（移动方式）表达式的解释操作
    public String interpret() {
        if (action.equalsIgnoreCase("move")) {
            return "移动";
        }
        else if (action.equalsIgnoreCase("run")) {
            return "快速移动";
        }
        else {
            return "无效指令";
        }
    }
}
