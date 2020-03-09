package AbstractFactory.SkinLibrary.factory;

import AbstractFactory.SkinLibrary.component.IButton;
import AbstractFactory.SkinLibrary.component.IComboBox;
import AbstractFactory.SkinLibrary.component.ITextField;
/**
 * 抽象的皮肤工厂
 * @author someexp
 *
 */
public interface ISkinFactory {
    public IButton createButton();
    public ITextField createTextField();
    public IComboBox createComboBox();
}
