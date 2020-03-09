package AbstractFactory.SkinLibrary.factory.impl;

import AbstractFactory.SkinLibrary.component.IButton;
import AbstractFactory.SkinLibrary.component.IComboBox;
import AbstractFactory.SkinLibrary.component.ITextField;
import AbstractFactory.SkinLibrary.component.summer.SummerButton;
import AbstractFactory.SkinLibrary.component.summer.SummerComboBox;
import AbstractFactory.SkinLibrary.component.summer.SummerTextField;
import AbstractFactory.SkinLibrary.factory.ISkinFactory;
/**
 * 夏天蓝蓝皮肤的实现类噢
 * 它能创建浅蓝色组件一族
 * @author someexp
 *
 */
public class SummerSkinFactory implements ISkinFactory{

    public IButton createButton() {
        // TODO Auto-generated method stub
        return new SummerButton();
    }

    public ITextField createTextField() {
        // TODO Auto-generated method stub
        return new SummerTextField();
    }

    public IComboBox createComboBox() {
        // TODO Auto-generated method stub
        return new SummerComboBox();
    }

}
