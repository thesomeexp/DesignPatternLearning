package Strategy.MarketPromotion.strategy;
/**
 * 打8折商品促销策略
 * 也可以传参打指定折
 * @author someexp
 *
 */
public class RebateStrategy implements IStrategy{

    private final double rate;
    
    /**
     * 构造方法设置打折率
     */
    public RebateStrategy() {
        this.rate = 0.8;
    }
    
    /**
     * 计算实际价格
     */
    public double realPrice(double consumePrice) {
        // TODO Auto-generated method stub
        return consumePrice * this.rate;
    }
    

}
