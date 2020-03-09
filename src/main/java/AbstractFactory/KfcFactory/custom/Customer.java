package AbstractFactory.KfcFactory.custom;
/**
 * 客户类
 * @author someexp
 *
 */

import AbstractFactory.KfcFactory.factory.IKfcFactory;
import AbstractFactory.KfcFactory.model.Beverage;
import AbstractFactory.KfcFactory.model.ChickenWings;
import AbstractFactory.KfcFactory.model.FrenchFries;
import AbstractFactory.KfcFactory.model.Hamburg;

/**
 * 通过 对象组合 的方式实现应用程序的解耦
 * @author someexp
 *
 */
public class Customer {
    // 抽象工厂
    private IKfcFactory kfcFactory;
    
    // 构造方法将抽象工厂传入
    public Customer(IKfcFactory kfcFactory) {
        this.kfcFactory = kfcFactory;
    }
    
    /**
     * 订购食物
     */
    // 订购麻辣鸡腿堡
    public int orderHamburg(int num) {
        // 获得嘛辣鸡腿堡
        Hamburg hamburg = kfcFactory.createHamburg(num);
        // 输出订购信息
        hamburg.printMessage();
        // 返回总价
        return hamburg.totalPrice();
    }
    // 订购普通薯条
    public int orderFrenchFries(int num) {
        // 获得普通薯条
        FrenchFries frenchFries = kfcFactory.createFrenchFries(num);
        // 输出订购信息
        frenchFries.printMessage();
        // 返回总价
        return frenchFries.totalPrice();
    }
    // 订购肥宅快乐水
    public int orderBeverage(int num) {
        // 获得肥宅快乐水
        Beverage beverage = kfcFactory.createBeverage(num);
        // 输出订购信息
        beverage.printMessage();
        // 返回总价
        return beverage.totalPrice();
    }
    // 订购奥尔良烤翅
    public int orderChickenWings(int num) {
        // 获得奥尔良烤翅
        ChickenWings chickenWings = kfcFactory.createChickenWings(num);
        // 输出订购信息
        chickenWings.printMessage();
        // 返回总价
        return chickenWings.totalPrice();
    }
    
    
}
