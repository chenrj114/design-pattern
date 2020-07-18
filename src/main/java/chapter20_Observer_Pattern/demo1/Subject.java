package chapter20_Observer_Pattern.demo1;

import java.util.ArrayList;

/**
 * @ClassName Subject
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 15:48
 * @Version 1.0
 */

public abstract class Subject {
    //定义一个观察者集合用于存储所有观察者对象
    protected ArrayList<Observer> observers = new ArrayList();

    //注册方法，用于向观察者集合中增加一个观察者
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //注销方法，用于在观察者集合中删除一个观察者
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //声明抽象通知方法
    public abstract void notifyObserver();
}

