package chapter12_Flyweight_Pattern.demo3;

/**
 * @ClassName Coordinates
 * @Description
 * @Author rjchen
 * @Date 2020-07-04 20:49
 * @Version 1.0
 */

//坐标类：外部状态类
public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

