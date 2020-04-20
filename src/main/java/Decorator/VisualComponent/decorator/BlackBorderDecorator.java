package Decorator.VisualComponent.decorator;

import Decorator.VisualComponent.base.Component;

/**
 * ConcreteDecorator(具体装饰类)
 * @author i
 *
 */
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框！");
    }
}