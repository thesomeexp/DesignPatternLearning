package Proxy.RedWine.real.impl;

import Proxy.RedWine.real.IRedWine;

/**
 * 真正的生产红酒厂
 * @author i
 *
 */
public class RealRedWineFactory implements IRedWine {
    // 生产红酒方法
    @Override
    public void product() {
        System.out.println("红酒工厂生产红酒...");
    }

    // 销售红酒方法
    @Override
    public void sell() {
        System.out.println("红酒工厂销售红酒");
    }
    
}
