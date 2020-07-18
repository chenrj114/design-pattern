package chapter19_Memento_Pattern.demo1;

/**
 * @ClassName Originator
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 14:38
 * @Version 1.0
 */

public class Originator {

    private String state;

    public Originator() {
    }

    // 创建一个备忘录对象
    public Memento createMemento() {
        return new Memento(this);
    }

    // 根据备忘录对象恢复原发器状态
    public void restoreMemento(Memento m) {
        state = m.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
