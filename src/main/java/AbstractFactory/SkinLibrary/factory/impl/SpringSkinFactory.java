package AbstractFactory.SkinLibrary.factory.impl;

import AbstractFactory.SkinLibrary.component.IButton;
import AbstractFactory.SkinLibrary.component.IComboBox;
import AbstractFactory.SkinLibrary.component.ITextField;
import AbstractFactory.SkinLibrary.component.spring.SpringButton;
import AbstractFactory.SkinLibrary.component.spring.SpringComboBox;
import AbstractFactory.SkinLibrary.component.spring.SpringTextField;
import AbstractFactory.SkinLibrary.factory.ISkinFactory;
/**
 * 春天绿绿皮肤的实现类噢
 * 它能创建浅绿色组件一族
 * @author someexp
 *
 */
public class SpringSkinFactory implements ISkinFactory {

    public IButton createButton() {
        // TODO Auto-generated method stub
        return new SpringButton();
    }

    public ITextField createTextField() {
        // TODO Auto-generated method stub
        return new SpringTextField();
    }

    public IComboBox createComboBox() {
        // TODO Auto-generated method stub
        return new SpringComboBox();
    }
    
}
