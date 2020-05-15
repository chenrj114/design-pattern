package chapter06_Builder_Pattern.demo3;

import chapter06_Builder_Pattern.demo2.Actor;

/**
 * @ClassName ActorBuilder
 * @Description 可以将Director和抽象建造者Builder进行合并，
 * 在Builder中提供逐步构建复杂产品对象的construct()方法。
 *
 * 同时还简化了系统结构，但加重了抽象建造者类的职责
 * 如果construct()方法较为复杂，待构建产品的组成部分较多，
 * 建议还是将construct()方法单独封装在Director中，这样做更符合“单一职责原则”。
 * @Author rjchen
 * @Date 2020-05-15 12:04
 * @Version 1.0
 */
abstract class ActorBuilder
{
    protected static Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    //工厂方法，返回一个完整的游戏角色对象
    public static Actor construct(ActorBuilder ab) {
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        return actor;
    }
}
