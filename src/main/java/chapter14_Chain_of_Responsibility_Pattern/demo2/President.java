package chapter14_Chain_of_Responsibility_Pattern.demo2;

/**
 * @ClassName President
 * @Description 董事长类：具体处理者
 * @Author rjchen
 * @Date 2020-07-05 12:41
 * @Version 1.0
 */ //
class President extends Approver {
    public President(String name) {
        super(name);
    }

    //具体请求处理方法
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 500000) {
            System.out.println("董事长" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");  //处理请求
        } else {
            this.successor.processRequest(request);  //转发请求
        }
    }
}
