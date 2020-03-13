package Builder.GameActorBuilde.director;

import Builder.GameActorBuilde.builder.ActorBuilder;
import Builder.GameActorBuilde.pojo.Actor;
/**
 * 指导者
 * @author someexp
 *
 */
public class ActorController {
    // 逐步构建复杂产品对象
    public Actor construct(ActorBuilder ab) {
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
