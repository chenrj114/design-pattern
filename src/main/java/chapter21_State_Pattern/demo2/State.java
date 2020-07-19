package chapter21_State_Pattern.demo2;

/**
 * @ClassName State
 * @Description
 * @Author rjchen
 * @Date 2020/7/19 10:08
 * @Version 1.0
 */

abstract class State {
    //声明抽象业务方法，不同的具体状态类可以不同的实现
    public abstract void handle();
}

