package Strategy.MarketPromotion.strategy;
/**
 * 策略接口
 * @author someexp
 *
 */
public interface IStrategy {
    /**
     * 计算实际价格方法
     * 在实际应用中价格不应该用double, 会导致精度损失
     * @param consumePrice
     * @return
     */
    public double realPrice(double consumePrice);
}
