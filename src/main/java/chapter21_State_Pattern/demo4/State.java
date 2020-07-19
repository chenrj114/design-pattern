package chapter21_State_Pattern.demo4;

/**
 * @ClassName State
 * @Description
 * @Author rjchen
 * @Date 2020/7/19 10:38
 * @Version 1.0
 */
abstract class State {
    public abstract void on(Switch s);
    public abstract void off(Switch s);
}
