package AbstractFactory.KfcFactory.model;

public abstract class Hamburg extends AbstractBaseFood implements IFood{
    public void printMessage() {
        System.out.println("--" + this.category + " 风味汉堡, \t 单价:" +
    this.price + ", \t数量: " + this.num + ", \t 合计: " + this.totalPrice());
    }
}
