package chapter06_Builder_Pattern.demo4;

import chapter06_Builder_Pattern.demo2.Actor;

/**
 * @ClassName ActorDirector
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 14:21
 * @Version 1.0
 */
public class ActorDirector {

    public Actor construct(ActorBuilder ab) {

        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();

        //通过钩子方法来控制产品的构建
        if (!ab.isBareheaded()) {
            ab.buildHairstyle();
        }

        actor = ab.createActor();
        return actor;
    }
}