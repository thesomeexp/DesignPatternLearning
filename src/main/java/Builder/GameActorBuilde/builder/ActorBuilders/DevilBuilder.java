package Builder.GameActorBuilde.builder.ActorBuilders;

import Builder.GameActorBuilde.builder.ActorBuilder;

/**
 * 恶魔建造者
 * @author someexp
 *
 */
public class DevilBuilder extends ActorBuilder{
    public void buildType() {
        actor.setType("恶魔");
    }

    public void buildSex() {
        actor.setSex("妖");
    }

    public void buildFace() {
        actor.setFace("丑陋");
    }

    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    public void buildHairstyle() {
        actor.setHairstyle("光头");
    }   

}
