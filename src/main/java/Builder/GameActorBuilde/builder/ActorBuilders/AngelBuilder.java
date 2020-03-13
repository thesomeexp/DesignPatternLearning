package Builder.GameActorBuilde.builder.ActorBuilders;

import Builder.GameActorBuilde.builder.ActorBuilder;
/**
 * 天使建造者
 * @author someexp
 *
 */
public class AngelBuilder extends ActorBuilder{
    public void buildType() {
        actor.setType("天使");
    }

    public void buildSex() {
        actor.setSex("女");
    }

    public void buildFace() {
        actor.setFace("漂亮");
    }

    public void buildCostume() {
        actor.setCostume("白裙");
    }

    public void buildHairstyle() {
        actor.setHairstyle("披肩长发");
    }   

}
