package chapter22_Strategy_Pattern.demo2;

/**
 * @ClassName Context
 * @Description
 * @Author rjchen
 * @Date 2020/7/19 11:46
 * @Version 1.0
 */
class Context {
    private AbstractStrategy strategy; //维持一个对抽象策略类的引用

    public void setStrategy(AbstractStrategy strategy) {
        this.strategy= strategy;
    }

    //调用策略类中的算法
    public void algorithm() {
        strategy.algorithm();
    }
}
