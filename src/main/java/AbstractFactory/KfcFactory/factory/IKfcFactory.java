package AbstractFactory.KfcFactory.factory;

import AbstractFactory.KfcFactory.model.Beverage;
import AbstractFactory.KfcFactory.model.ChickenWings;
import AbstractFactory.KfcFactory.model.FrenchFries;
import AbstractFactory.KfcFactory.model.Hamburg;

/**
 * 肯德基抽象工厂
 * 创建一个产品家族的抽象类型
 * @author someexp
 *
 */


public interface IKfcFactory {
    // 生产汉堡
    public Hamburg createHamburg(int num);
    // 生产薯条
    public FrenchFries createFrenchFries(int num);
    // 生产鸡翅
    public ChickenWings createChickenWings(int num);
    // 生产饮料
    public Beverage createBeverage(int num);
}
