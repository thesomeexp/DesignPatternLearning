package Builder.MobilePackage.itf;

import Builder.MobilePackage.pojo.MobilePackage;

/**
 * 手机套餐Builder
 * 
 * @author someexp
 *
 */
public interface IMobileBuilder {
   // 建造手机套餐的话费
    public void buildMoney();
    // 建造手机套餐的短信
    public void buildShortInfo();
    // 建造手机套餐的彩铃
    public void buildMusic();
    // 返回建造的手机套餐对象
    public MobilePackage getMobilePackage();
}
