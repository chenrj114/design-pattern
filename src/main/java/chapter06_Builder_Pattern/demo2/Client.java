package chapter06_Builder_Pattern.demo2;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName Client
 * @Description 客户端只需实例化指挥者类，指挥者类针对抽象建造者编程，
 * 客户端根据需要传入具体的建造者类型，指挥者将指导具体建造者一步一步构造一个完整的产品
 * @Author rjchen
 * @Date 2020-05-15 12:16
 * @Version 1.0
 */
@Slf4j
class Client
{
    public static void main(String args[])
    {
        ActorBuilder ab; //针对抽象建造者编程
        ab = (ActorBuilder)XMLUtil.getBean(); //反射生成具体建造者对象

        ActorDirector ac = new ActorDirector();
        Actor actor;
        actor = ac.construct(ab); //通过指挥者创建完整的建造者对象
        log.info(actor.toString());
    }
}
