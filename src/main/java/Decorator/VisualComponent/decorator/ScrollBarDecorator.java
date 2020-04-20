package Decorator.VisualComponent.decorator;

import Decorator.VisualComponent.base.Component;

/**
 * ConcreteDecorator(具体装饰类)
 * @author i
 *
 */
public class ScrollBarDecorator extends ComponentDecorator {
    public ScrollBarDecorator(Component component) {
        super(component);
    }

    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar() {
        System.out.println("为构件增加滚动条！");
    }
}