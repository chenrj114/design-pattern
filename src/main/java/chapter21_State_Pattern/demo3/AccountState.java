package chapter21_State_Pattern.demo3;

/**
 * @ClassName AccountState
 * @Description 抽象状态类
 * @Author rjchen
 * @Date 2020/7/19 10:14
 * @Version 1.0
 */
abstract class AccountState {
    protected Account acc;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();
}
