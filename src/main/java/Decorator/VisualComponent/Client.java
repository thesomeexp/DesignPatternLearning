package Decorator.VisualComponent;

import Decorator.VisualComponent.base.Component;
import Decorator.VisualComponent.base.Window;
import Decorator.VisualComponent.decorator.BlackBorderDecorator;
import Decorator.VisualComponent.decorator.ScrollBarDecorator;

public class Client {
    public static void main(String args[]) {
        Component component, componentSB, componentBB;  // 使用抽象构件定义全部对象
        component = new Window();         // 创建具体构件对象
        componentSB = new ScrollBarDecorator(component); // 创建装饰后的构件对象        
        componentBB = new BlackBorderDecorator(componentSB); // 将装饰了一次的对象注入另一个装饰类中，进行第二次装饰
        componentBB.display();
    }
}