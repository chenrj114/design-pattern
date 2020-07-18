package chapter19_Memento_Pattern.demo1;

/**
 * @ClassName Caretaker
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 14:39
 * @Version 1.0
 */

public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento=memento;
    }
}
