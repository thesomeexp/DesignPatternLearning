package AbstractFactory.KfcFactory;

import AbstractFactory.KfcFactory.custom.Customer;
import AbstractFactory.KfcFactory.factory.ChinaKfcFactory;
import AbstractFactory.KfcFactory.factory.IKfcFactory;

/**
 * 开始点餐啦~~~写的我都饿了
 * @author someexp
 *
 */
public class MainApp {
    public static void main(String[] args) {
        /**
         * 定义一个肯德基(IKfcFactory类型)
         */
        IKfcFactory kfcFactory = new ChinaKfcFactory();
        /**
         * 爸爸和儿子走进肯德基, 准备点餐
         */
        Customer customer = new Customer(kfcFactory);
        /**
         * 开始点餐
         */
        // 一个嘛辣鸡腿堡 谢谢!
        int hambergMoney = customer.orderHamburg(1);
        // 四个奥尔良烤翅 谢谢!
        int chickenWingsMoney = customer.orderChickenWings(4);
        // 一包薯条 谢谢~
        int frenchMoney = customer.orderFrenchFries(1);
        // 不能忘了我的肥宅快乐水!!!!
        int beverageMoney = customer.orderBeverage(2);
        
        System.out.println("一共系:" + (hambergMoney + chickenWingsMoney + 
                frenchMoney + beverageMoney) + "蚊! 信用卡定系现金? ");
    }
}
