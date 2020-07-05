package chapter14_Chain_of_Responsibility_Pattern.demo1;

/**
 * @ClassName Handler
 * @Description
 * @Author rjchen
 * @Date 2020-07-05 12:19
 * @Version 1.0
 */

public abstract class Handler {

    //维持对下家的引用
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor=successor;
    }

    public abstract void handleRequest(String request);
}
