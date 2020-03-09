package AbstractFactory.KfcFactory.model.kfc;

import AbstractFactory.KfcFactory.model.Hamburg;

/**
 * 中国麻辣汉堡
 * @author someexp
 *
 */
public class ChinaHamburg extends Hamburg{
    public ChinaHamburg(int num) {
        // TODO Auto-generated constructor stub
        this.category = "中国麻辣";
        this.price = 14;
        this.num = num;
    }
}
