package Builder.MobilePackage.itf.impl;

import Builder.MobilePackage.base.AbstractBasePackage;
import Builder.MobilePackage.itf.IMobileBuilder;
import Builder.MobilePackage.pojo.MobilePackage;

/**
 * 套餐1
 * 20元包400短信
 * @author someexp
 *
 */
public class MobileBuilderImpl1 extends AbstractBasePackage implements 
IMobileBuilder {
    // 建造手机套餐的话费
    public void buildMoney() {
        this.mobilePackage.setMoney(20);
    }
    // 建造手机套餐的彩铃
    public void buildMusic() {
        this.mobilePackage.setMusic("天使");
    }
    // 建造手机套餐的短信
    public void buildShortInfo() {
        this.mobilePackage.setShortInfo(400);
    }
    public MobilePackage getMobilePackage() {
        return this.mobilePackage;
    }
}
