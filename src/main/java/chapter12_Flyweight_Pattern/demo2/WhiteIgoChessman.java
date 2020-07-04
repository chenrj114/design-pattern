package chapter12_Flyweight_Pattern.demo2;

/**
 * @ClassName WhiteIgoChessman
 * @Description
 * @Author rjchen
 * @Date 2020-07-04 20:30
 * @Version 1.0
 */
//白色棋子类：具体享元类
class WhiteIgoChessman extends IgoChessman {
    public String getColor() {
        return "白色";
    }
}
