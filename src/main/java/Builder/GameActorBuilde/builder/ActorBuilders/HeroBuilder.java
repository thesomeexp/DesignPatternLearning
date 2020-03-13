package Builder.GameActorBuilde.builder.ActorBuilders;

import Builder.GameActorBuilde.builder.ActorBuilder;

/**
 * 英雄建造者
 * @author someexp
 *
 */
public class HeroBuilder extends ActorBuilder{
    public void buildType() {
        actor.setType("英雄");
    }

    public void buildSex() {
        actor.setSex("男");
    }

    public void buildFace() {
        actor.setFace("英俊");
    }

    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    public void buildHairstyle() {
        actor.setHairstyle("飘逸");
    }   

}
