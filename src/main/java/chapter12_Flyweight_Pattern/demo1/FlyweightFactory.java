package chapter12_Flyweight_Pattern.demo1;

import java.util.HashMap;

/**
 * @ClassName FlyweightFactory
 * @Description
 * @Author rjchen
 * @Date 2020-07-04 10:34
 * @Version 1.0
 */

public class FlyweightFactory {

    //定义一个HashMap用于存储享元对象，实现享元池
    private final HashMap flyweights = new HashMap();

    public Flyweight getFlyweight(String key) {
        //如果对象存在，则直接从享元池获取
        if (flyweights.containsKey(key)) {
            return (Flyweight) flyweights.get(key);
        }

        //如果对象不存在，先创建一个新的对象添加到享元池中，然后返回
        else {
            Flyweight fw = new ConcreteFlyweight();
            flyweights.put(key, fw);
            return fw;
        }
    }
}