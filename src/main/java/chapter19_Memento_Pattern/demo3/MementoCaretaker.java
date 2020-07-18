package chapter19_Memento_Pattern.demo3;

import chapter19_Memento_Pattern.demo2.ChessmanMemento;

import java.util.ArrayList;

/**
 * @ClassName MementoCaretaker
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 15:04
 * @Version 1.0
 */
class MementoCaretaker {
    //定义一个集合来存储多个备忘录
    private ArrayList mementolist = new ArrayList();

    public ChessmanMemento getMemento(int i) {
        return (ChessmanMemento)mementolist.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementolist.add(memento);
    }
}