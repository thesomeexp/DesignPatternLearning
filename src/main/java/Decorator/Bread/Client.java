package Decorator.Bread;

import Decorator.Bread.decorator.CornDecorator;
import Decorator.Bread.decorator.SweetDecorator;

public class Client {
    public static void main(String[] args) {
        System.out.println("=====开始装饰馒头!!!!!");
        // 创建普通的正常馒头实例
        // 这是我们需要包装(装饰)的对象实例
        IBread normalBread = new NormalBread();
        
        // 下面开始对正常馒头进行装饰
        // 使用甜蜜素装饰馒头
        normalBread = new SweetDecorator(normalBread);
        // 使用柠檬黄的着色剂装饰馒头
        normalBread = new CornDecorator(normalBread);
        // 生产馒头信息
        normalBread.process();
        System.out.println("=====装饰馒头结束!!!!!");
    }
}
