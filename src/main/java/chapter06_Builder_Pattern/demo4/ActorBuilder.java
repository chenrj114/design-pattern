package chapter06_Builder_Pattern.demo4;

import chapter06_Builder_Pattern.demo2.Actor;

/**
 * @ClassName ActorBuilder
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 14:18
 * @Version 1.0
 */
public abstract class ActorBuilder {

    protected static Actor actor = new Actor();

    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();

    public boolean isBareheaded() {
        return false;
    }

    public Actor createActor() {
        return actor;
    }
}
