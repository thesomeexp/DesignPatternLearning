package Decorator.Bread.decorator;

import Decorator.Bread.IBread;
/**
 * 抽象装饰者
 * 装饰者
 * @author i
 *
 */
public class AbstractBread implements IBread {
    // 存储传入的IBread对象
    private final IBread bread;
    
    public AbstractBread(IBread bread) {
        this.bread = bread;
    }

    @Override
    public void prepair() {
        this.bread.prepair();
    }

    @Override
    public void kneadFlour() {
        this.bread.kneadFlour();
    }

    @Override
    public void steamed() {
        this.bread.steamed();
    }

    @Override
    public void process() {
        prepair();
        kneadFlour();
        steamed();
    }
    
    
}
