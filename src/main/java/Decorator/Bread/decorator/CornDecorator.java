package Decorator.Bread.decorator;

import Decorator.Bread.IBread;
/**
 * 染色的玉米馒头
 * 装饰者实现
 * @author i
 *
 */
public class CornDecorator extends AbstractBread {

    public CornDecorator(IBread bread) {
        super(bread);
    }
    
    // 黑心商贩开始染色
    public void paint() {
        System.out.println("添加柠檬黄的着色剂...");
    }

    // 重载父类和面方法
    @Override
    public void kneadFlour() {
        // 在面粉加入染色剂后才开始和面
        this.paint();
        // 和面
        super.kneadFlour();
    }
    
    
}
