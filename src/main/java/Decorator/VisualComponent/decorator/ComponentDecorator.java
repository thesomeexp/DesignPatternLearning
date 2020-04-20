package Decorator.VisualComponent.decorator;

import Decorator.VisualComponent.base.Component;

/**
 * Decorator(抽象装饰类)
 * @author i
 *
 */
public class ComponentDecorator extends Component {
    private Component component;  // 维持对抽象构件类型对象的引用
  
    // 注入抽象构件类型的对象
    public ComponentDecorator(Component component) {
        this.component = component;
    }

    public void display() {
        component.display();
    }
}