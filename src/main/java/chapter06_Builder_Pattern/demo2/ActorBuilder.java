package chapter06_Builder_Pattern.demo2;

/**
 * @ClassName ActorBuilder
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 12:04
 * @Version 1.0
 */
abstract class ActorBuilder
{
    protected Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    //工厂方法，返回一个完整的游戏角色对象
    public Actor createActor()
    {
        return actor;
    }
}
