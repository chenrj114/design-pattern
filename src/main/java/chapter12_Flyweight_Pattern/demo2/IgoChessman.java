package chapter12_Flyweight_Pattern.demo2;

/**
 * @ClassName IgoChessman
 * @Description
 * @Author rjchen
 * @Date 2020-07-04 20:30
 * @Version 1.0
 */
//围棋棋子类：抽象享元类
public abstract class IgoChessman {
    public abstract String getColor();

    public void display() {
        System.out.println("棋子颜色：" + this.getColor());
    }
}
