package Strategy.MarketPromotion.strategy;
/**
 * 满200, 高于200部分打8折商品促销策略
 * @author someexp
 *
 */
public class PromotionalStrategy implements IStrategy {

    public double realPrice(double consumePrice) {
        // TODO Auto-generated method stub
        if (consumePrice > 200) {
            return 200 + (consumePrice - 200) * 0.8;
        } else {
            return consumePrice;
        }
    }
    
}
