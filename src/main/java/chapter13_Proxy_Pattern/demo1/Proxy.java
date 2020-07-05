package chapter13_Proxy_Pattern.demo1;

/**
 * @ClassName Proxy
 * @Description
 * @Author rjchen
 * @Date 2020-07-05 10:00
 * @Version 1.0
 */

public class Proxy extends Subject {

    private RealSubject realSubject = new RealSubject(); //维持一个对真实主题对象的引用

    public void PreRequest() {
        //Todo
    }

    @Override
    public void Request() {
        PreRequest();
        realSubject.Request();
        PostRequest();
    }

    public void PostRequest() {
        //Todo
    }
}
