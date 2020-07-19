package chapter21_State_Pattern.demo4;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020/7/19 10:38
 * @Version 1.0
 */
class Client {

    public static void main(String args[]) {

        Switch s1,s2;
        s1=new Switch("开关1");
        s2=new Switch("开关2");

        s1.on();
        s2.on();
        s1.off();
        s2.off();
        s2.on();
        s1.on();
    }
}
