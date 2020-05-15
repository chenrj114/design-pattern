package chapter06_Builder_Pattern.demo4;

/**
 * @ClassName DevilBuilder
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 14:20
 * @Version 1.0
 */
public class DevilBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }

    //覆盖钩子方法
    @Override
    public boolean isBareheaded() {
        return true;
    }


}
