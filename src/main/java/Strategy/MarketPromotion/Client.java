package Strategy.MarketPromotion;

import java.util.Random;

import Strategy.MarketPromotion.context.Context;
import Strategy.MarketPromotion.strategy.PromotionalStrategy;
import Strategy.MarketPromotion.strategy.RebateStrategy;
import Strategy.MarketPromotion.strategy.ReduceStrategy;

/**
 * 客户端应用程序
 * 在实际应用中价格不应该用double, 会导致精度损失
 * @author someexp
 *
 */
public class Client {
    public static void main(String[] args) {
        // 创建上下文环境对象实例
        Context context = new Context();
        // 随机数对象
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            // 以产生随机数的方式判断使用何种促销策略
            int x = random.nextInt(3);
            // 消费价格也是随机数产生的(不能为0)
            double consumePrice = 0;
            while ((consumePrice = random.nextInt(2000)) == 0) {
            }
            switch (x) {
            case 0:
                // 打8折商品
                context.setStrategy(new RebateStrategy());
                break;
            case 1:
                // 满200, 高于200部分打8折商品
                context.setStrategy(new PromotionalStrategy());
                break;
            case 2:
                // 满1000减200商品
                context.setStrategy(new ReduceStrategy());
                break;
            }
            System.out.println("[" 
                    + (x == 0 ? "打8折" : (x == 1 ? "高于200部分打8折" 
                            : (x == 2 ? "满1000减200" : ""))) + "]商品:");
            System.out.println("原价:" + consumePrice + "---优惠后价格:"
                    + context.cul(consumePrice));
        }
    }
}
