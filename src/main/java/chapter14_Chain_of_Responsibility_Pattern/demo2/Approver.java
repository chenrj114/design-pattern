package chapter14_Chain_of_Responsibility_Pattern.demo2;

/**
 * @ClassName Approver
 * @Description 审批者类：抽象处理者
 * @Author rjchen
 * @Date 2020-07-05 12:41
 * @Version 1.0
 */

abstract class Approver {
    protected Approver successor; //定义后继对象
    protected String name; //审批者姓名

    public Approver(String name) {
        this.name = name;
    }

    //设置后继者
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    //抽象请求处理方法
    public abstract void processRequest(PurchaseRequest request);
}
