package chapter21_State_Pattern.demo3;

/**
 * @ClassName RestrictedState
 * @Description 受限状态：具体状态类
 * @Author rjchen
 * @Date 2020/7/19 10:14
 * @Version 1.0
 */
class RestrictedState extends AccountState {

    public RestrictedState(AccountState state) {
        this.acc = state.acc;
    }

    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        System.out.println("帐号受限，取款失败");
    }

    public void computeInterest() {
        System.out.println("计算利息！");
    }

    //状态转换
    public void stateCheck() {
        if(acc.getBalance() > 0) {
            acc.setState(new NormalState(this));
        }
        else if(acc.getBalance() > -2000) {
            acc.setState(new OverdraftState(this));
        }
    }
}
