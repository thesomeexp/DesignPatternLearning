package Strategy.StrategyOfCompany;

import Strategy.StrategyOfCompany.strategy.DuckDuckGoCompany;
import Strategy.StrategyOfCompany.strategy.GoogleCompany;
import Strategy.StrategyOfCompany.strategy.ICompany;
/**
 * 不同公司采用不同的宣传策略(口号)
 * 灵感来源: 接口和抽象类有什么区别？ - 沉默王二的回答 - 知乎
https://www.zhihu.com/question/20149818/answer/885496046
 * @author someexp
 *
 */
public class Demo {
    public static void printSlogan(ICompany iCompany) {
        iCompany.slogan();
    }
    /**
     * 选择不同的公司执行不同的策略
     * @param args
     */
    public static void main(String[] args) {
        printSlogan(new GoogleCompany());
        printSlogan(new DuckDuckGoCompany());
    }
}
