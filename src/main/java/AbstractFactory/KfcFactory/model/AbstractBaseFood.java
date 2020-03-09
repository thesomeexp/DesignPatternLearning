package AbstractFactory.KfcFactory.model;
/**
 * 食物基类
 * 
 * @author someexp
 *
 */
public abstract class AbstractBaseFood {
    // 类别
    protected String category;
    // 数量
    protected int num;
    // 价格
    protected int price;
    
    // 合计
    public int totalPrice() {
        return this.num * this.price;
    }
}
