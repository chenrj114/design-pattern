package chapter22_Strategy_Pattern.demo2;

import org.junit.Test;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020/7/19 12:08
 * @Version 1.0
 */

public class Client {

    @Test
    public void test() {
        Context context = new Context();
        AbstractStrategy strategy;
        strategy = new ConcreteStrategyA(); //可在运行时指定类型
        context.setStrategy(strategy);
        context.algorithm();
    }
}
