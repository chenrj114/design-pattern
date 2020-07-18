package chapter19_Memento_Pattern.demo2;

/**
 * @ClassName MementoCaretaker
 * @Description 象棋棋子备忘录管理类：负责人
 * @Author rjchen
 * @Date 2020/7/18 14:45
 * @Version 1.0
 */
class MementoCaretaker {
    private ChessmanMemento memento;

    public ChessmanMemento getMemento() {
        return memento;
    }

    public void setMemento(ChessmanMemento memento) {
        this.memento = memento;
    }
}
