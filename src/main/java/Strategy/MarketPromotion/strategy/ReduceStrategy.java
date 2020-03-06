package Strategy.MarketPromotion.strategy;
/**
 * 满1000减200商品促销策略
 * @author someexp
 *
 */
public class ReduceStrategy implements IStrategy {
    /**
     * 计算实际价格方法
     */
    public double realPrice(double consumePrice) {
        // TODO Auto-generated method stub
        if (consumePrice >= 1000) {
            return consumePrice - 200;
        } else {
            return consumePrice;
        }
    }

}
