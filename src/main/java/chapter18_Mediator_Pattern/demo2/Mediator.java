package chapter18_Mediator_Pattern.demo2;

import java.util.ArrayList;

/**
 * @ClassName Mediator
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 14:03
 * @Version 1.0
 */

public abstract class Mediator {
    protected ArrayList<Colleague> colleagues; //用于存储同事对象

    //注册方法，用于增加同事对象
    public void register(Colleague colleague) {
        colleagues.add(colleague);
    }

    //声明抽象的业务方法
    public abstract void operation();
}

