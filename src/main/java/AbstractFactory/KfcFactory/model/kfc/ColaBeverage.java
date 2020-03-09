package AbstractFactory.KfcFactory.model.kfc;

import AbstractFactory.KfcFactory.model.Beverage;

/**
 * 肥宅快乐水
 * @author someexp
 *
 */
public class ColaBeverage extends Beverage{
    public ColaBeverage(int num) {
        // TODO Auto-generated constructor stub
        this.category = "普通";
        this.price = 3;
        this.num = num;
    }
}
