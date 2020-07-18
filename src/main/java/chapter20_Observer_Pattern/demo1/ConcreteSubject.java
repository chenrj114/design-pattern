package chapter20_Observer_Pattern.demo1;

/**
 * @ClassName ConcreteSubject
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 15:49
 * @Version 1.0
 */
class ConcreteSubject extends Subject {
    //实现通知方法
    public void notifyObserver() {
        //遍历观察者集合，调用每一个观察者的响应方法
        for(Object obs:observers) {
            ((Observer)obs).update();
        }
    }
}
