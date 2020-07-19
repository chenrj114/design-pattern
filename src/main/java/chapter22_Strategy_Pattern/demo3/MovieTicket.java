package chapter22_Strategy_Pattern.demo3;

/**
 * @ClassName MovieTicket
 * @Description 电影票类：环境类
 * @Author rjchen
 * @Date 2020/7/19 12:10
 * @Version 1.0
 */

class MovieTicket {

    private double price;
    private Discount discount; //维持一个对抽象折扣类的引用

    public void setPrice(double price) {
        this.price = price;
    }

    //注入一个折扣类对象
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getPrice() {
        //调用折扣类的折扣价计算方法
        return discount.calculate(this.price);
    }
}

