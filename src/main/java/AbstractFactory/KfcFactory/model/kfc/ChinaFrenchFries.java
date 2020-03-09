package AbstractFactory.KfcFactory.model.kfc;

import AbstractFactory.KfcFactory.model.FrenchFries;

/**
 * 好吃的薯条~~~~~
 * @author someexp
 *
 */
public class ChinaFrenchFries extends FrenchFries{
    public ChinaFrenchFries(int num) {
        // TODO Auto-generated constructor stub
        this.category = "普通";
        this.price = 7;
        this.num = num;
    }
}
