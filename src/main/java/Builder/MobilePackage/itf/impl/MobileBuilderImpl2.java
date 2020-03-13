package Builder.MobilePackage.itf.impl;

import Builder.MobilePackage.base.AbstractBasePackage;
import Builder.MobilePackage.itf.IMobileBuilder;
import Builder.MobilePackage.pojo.MobilePackage;

/**
 * 套餐2
 * 30元600条短信
 * @author someexp
 *
 */
public class MobileBuilderImpl2 extends AbstractBasePackage implements
IMobileBuilder {

    public void buildMoney() {
        this.mobilePackage.setMoney(30);
    }

    public void buildShortInfo() {
        this.mobilePackage.setShortInfo(600);
    }

    public void buildMusic() {
        this.mobilePackage.setMusic("大海");
    }

    public MobilePackage getMobilePackage() {
        return this.mobilePackage;
    }
    
}
