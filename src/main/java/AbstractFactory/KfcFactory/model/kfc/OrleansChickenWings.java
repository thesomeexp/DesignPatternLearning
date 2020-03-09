package AbstractFactory.KfcFactory.model.kfc;

import AbstractFactory.KfcFactory.model.ChickenWings;

/**
 * 哎呀, 这是奥尔良烤翅噢!!!!
 * @author someexp
 *
 */
public class OrleansChickenWings extends ChickenWings{
    public OrleansChickenWings(int num) {
        // TODO Auto-generated constructor stub
        this.category = "奥尔良";
        this.price = 3;
        this.num = num;
    }
}
