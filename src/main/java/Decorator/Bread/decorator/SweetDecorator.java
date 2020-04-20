package Decorator.Bread.decorator;

import Decorator.Bread.IBread;

/**
 * 甜蜜素馒头
 * 装饰者实现
 * @author i
 *
 */
public class SweetDecorator extends AbstractBread {

    public SweetDecorator(IBread bread) {
        super(bread);
    }
    
    // 黑心商贩开始添加甜蜜素
    public void paint() {
        System.out.println("添加甜蜜素...");
    }

    @Override
    public void kneadFlour() {
        // 在加入甜蜜素后才开始和面
        this.paint();
        super.kneadFlour();
    }
}
