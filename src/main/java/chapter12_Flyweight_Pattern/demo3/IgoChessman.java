package chapter12_Flyweight_Pattern.demo3;

/**
 * @ClassName IgoChess
 * @Description
 * @Author rjchen
 * @Date 2020-07-04 20:51
 * @Version 1.0
 */ //围棋棋子类：抽象享元类
abstract class IgoChessman {
    public abstract String getColor();

    public void display(Coordinates coord){
        System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coord.getX() + "，" + coord.getY() );
    }
}
