package chapter21_State_Pattern.demo5;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020/7/19 11:22
 * @Version 1.0
 */

class Client {

    public static void main(String args[]) {
        Screen screen = new Screen();
        screen.onClick();
        screen.onClick();
        screen.onClick();
    }
}
