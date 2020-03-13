package Builder.GameActorBuilde;

import Builder.GameActorBuilde.builder.ActorBuilder;
import Builder.GameActorBuilde.builder.ActorBuilders.AngelBuilder;
import Builder.GameActorBuilde.builder.ActorBuilders.DevilBuilder;
import Builder.GameActorBuilde.director.ActorController;
import Builder.GameActorBuilde.pojo.Actor;

public class Client {
    public static void main(String args[]) {
        ActorBuilder ab = new AngelBuilder(); // 针对抽象建造者编程

        ActorController ac = new ActorController();
        Actor actor;
        actor = ac.construct(ab); // 通过指导者创建完整的建造者对象

        String type = actor.getType();
        System.out.println(type + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());
        
        System.out.println("---构建第二个角色---");
        
        ab = new DevilBuilder();
        Actor actor2 = new ActorController().construct(ab);
        type = actor2.getType();
        System.out.println(type + "的外观：");
        System.out.println("性别：" + actor2.getSex());
        System.out.println("面容：" + actor2.getFace());
        System.out.println("服装：" + actor2.getCostume());
        System.out.println("发型：" + actor2.getHairstyle());
        
        
    }

}
