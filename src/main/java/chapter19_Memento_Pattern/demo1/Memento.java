package chapter19_Memento_Pattern.demo1;

/**
 * @ClassName Memento
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 14:38
 * @Version 1.0
 */

//备忘录类，默认可见性，包内可见
class Memento {

    private String state;

    public Memento(Originator o) {
        state = o.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
