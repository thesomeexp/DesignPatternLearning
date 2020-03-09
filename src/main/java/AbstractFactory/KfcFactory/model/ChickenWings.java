package AbstractFactory.KfcFactory.model;
/**
 * 鸡翅基类
 * 
 * @author someexp
 *
 */
public abstract class ChickenWings extends AbstractBaseFood implements IFood{
    public void printMessage() {
        System.out.println("--" + this.category + " 风味鸡翅, \t 单价:" +
    this.price + ", \t数量: " + this.num + ", \t 合计: " + this.totalPrice());
    }
}
