package Flyweight.FiveChessman.factory;

import java.util.Hashtable;

import Flyweight.FiveChessman.object.AbstractChesman;
import Flyweight.FiveChessman.object.BlackChessman;
import Flyweight.FiveChessman.object.WhiteChessman;

public class FiveChessmanFactory {
    // 单例模式工厂
    private static FiveChessmanFactory 
    fiveChessmanFactory  = new FiveChessmanFactory();
    
    // 缓存存放共享对象
    private final Hashtable<Character, AbstractChesman>
    cache = new Hashtable<Character, AbstractChesman>();
    
    // 私有化构造方法
    private FiveChessmanFactory() {
        
    }
    
    // 获得单例工程
    public static FiveChessmanFactory getInstance() {
        return fiveChessmanFactory;
    }
    
    /**
     * 根据字符获得棋子
     */
    public AbstractChesman getChessmanObject(char c) {
        // 从缓存中获得棋子对象实例
        AbstractChesman abstractChesman = this.cache.get(c);
        if (abstractChesman == null) {
            // 缓存中没有棋子对象实例信息, 则创建棋子对象实例并放入缓存
            // PS: 其实也不用每次判断缓存中有没有
            // 可以直接写成private构造函数, 在构造时就把两个对象创建好
            switch (c) {
            case 'B':
                abstractChesman = new BlackChessman();
                break;
            case 'W':
                abstractChesman = new WhiteChessman();
            default:
                break;
            }
            
            // 为了防止非法字符进入, 返回null
            if (abstractChesman != null) {
                // 放入缓存
                this.cache.put(c, abstractChesman);
            }
        }
        // 如果缓存中存在棋子对象则直接返回
        return abstractChesman;
    }
}
