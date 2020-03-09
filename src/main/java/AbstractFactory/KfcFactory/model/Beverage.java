package AbstractFactory.KfcFactory.model;
/**
 * 饮料基类
 * @author someexp
 *
 */
public abstract class Beverage extends AbstractBaseFood implements IFood{
    public void printMessage() {
        System.out.println("--" + this.category + " 饮料, \t 单价:" +
    this.price + ", \t数量: " + this.num + ", \t 合计: " + this.totalPrice());
    }
}
