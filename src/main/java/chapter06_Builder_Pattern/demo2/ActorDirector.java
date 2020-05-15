package chapter06_Builder_Pattern.demo2;

/**
 * @ClassName ActorController
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 12:10
 * @Version 1.0
 */
public class ActorDirector {

    public Actor construct(ActorBuilder ab)
    {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        actor=ab.createActor();
        return actor;
    }
}
