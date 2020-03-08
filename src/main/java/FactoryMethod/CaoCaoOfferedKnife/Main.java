package FactoryMethod.CaoCaoOfferedKnife;

import FactoryMethod.CaoCaoOfferedKnife.factory.ISwordFactory;
import FactoryMethod.CaoCaoOfferedKnife.factory.impl.CaoCao;
import FactoryMethod.CaoCaoOfferedKnife.factory.impl.CaoCao2;
import FactoryMethod.CaoCaoOfferedKnife.model.AbstractSword;

/**
 * 工厂方法模式
 * 工厂不生产具体的对象实例
 * 而是交由齐工厂子类生产
 * @author someexp
 *
 */
public class Main {
    public static void main(String[] args) {
        // 创建曹操实例化对象(返回使用接口类型ISwordFactory)
        ISwordFactory swordFactory = new CaoCao();
        // 获得宝刀实例--七星宝刀
        AbstractSword sword = swordFactory.createSword();
        // 刺杀董卓
        System.out.println("曹操使用" + sword.getName() + "刺杀董卓!");
        
        // 新增八星宝刀 -- 不影响上面的程序新增功能; 开闭原则
        ISwordFactory swordFactory2 = new CaoCao2();
        AbstractSword sword2 = swordFactory2.createSword();
        System.out.println("曹操使用" + sword2.getName() + "刺杀董卓!");
    
        
    }
}
