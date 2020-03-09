package AbstractFactory.SkinLibrary;

import AbstractFactory.SkinLibrary.component.IButton;
import AbstractFactory.SkinLibrary.component.IComboBox;
import AbstractFactory.SkinLibrary.component.ITextField;
import AbstractFactory.SkinLibrary.factory.ISkinFactory;
import AbstractFactory.SkinLibrary.factory.impl.SpringSkinFactory;
import AbstractFactory.SkinLibrary.factory.impl.SummerSkinFactory;

/**
 * 你即将看到高级的切换皮肤功能
 * 换一家工厂, 就能生产出对应的同皮肤组件~~~
 * 强迫症看到最舒服的一个设计模式
 * @author someexp
 *
 */
public class Client {
    public static void main(String[] args) {
        // 使用抽象层定义
        ISkinFactory skinFactory;
        IButton button;
        IComboBox comboBox;
        ITextField textField;
        // 模拟从配置文件读皮肤
        SpringSkinFactory springSkinFactory = new SpringSkinFactory();
        // 并把生成的皮肤工厂的引用赋给
        skinFactory = springSkinFactory;
        button = skinFactory.createButton();
        comboBox = skinFactory.createComboBox();
        textField = skinFactory.createTextField();
        button.display();
        comboBox.display();
        textField.display();
        
        // 换皮肤提醒~~~
        System.out.println("change skin");
        // 模拟使用新的皮肤
        SummerSkinFactory summerSkinFactory = new SummerSkinFactory();
        skinFactory = summerSkinFactory;
        button = skinFactory.createButton();
        comboBox = skinFactory.createComboBox();
        textField = skinFactory.createTextField();
        button.display();
        comboBox.display();
        textField.display();
        
        
        
    }
}
