package Builder.MobilePackage.director;

import Builder.MobilePackage.itf.IMobileBuilder;
import Builder.MobilePackage.pojo.MobilePackage;

/**
 * 手机套餐指导者
 * @author someexp
 *
 */
public class MobileDirector {
    public MobilePackage createMobilePackage(IMobileBuilder mobileBuilder) {
        if (mobileBuilder != null) {
            // 构造话费
            mobileBuilder.buildMoney();
            // 构造短信
            mobileBuilder.buildShortInfo();
            // 构造彩铃
            mobileBuilder.buildMusic();
            return mobileBuilder.getMobilePackage();
        }
        return null;
    }
}
