package chapter14_Chain_of_Responsibility_Pattern.demo1;

/**
 * @ClassName ConcreteHandler
 * @Description
 * @Author rjchen
 * @Date 2020-07-05 12:37
 * @Version 1.0
 */

class ConcreteHandler extends Handler {

    public void handleRequest(String request) {
        if (canHandle(request)) {
            //处理请求
        }
        else {
            this.successor.handleRequest(request);  //转发请求
        }
    }

    // 判断当前的handler是否满足处理当前请求的条件
    boolean canHandle(String request) {
        //
        return true;
    }
}
