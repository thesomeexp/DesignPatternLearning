package Proxy.RedWine;

import Proxy.RedWine.proxy.RedWineProxy;
import Proxy.RedWine.real.IRedWine;
import Proxy.RedWine.real.impl.RealRedWineFactory;

public class Client {
    public static void main(String[] args) {
        // 创建真实的红酒工厂对象实例
        IRedWine realRedWineFactory = 
                new RealRedWineFactory();
        // 获得代理对象实例
        IRedWine redWineProxy = 
                new RedWineProxy(realRedWineFactory);
        // 代理商生产红酒(其实真正生产的是工厂)
        redWineProxy.product();
        // 代理商销售红酒(批发价拿货, 然后以较高价格出售, 赚取差额利润)
        redWineProxy.sell();
    }
}
