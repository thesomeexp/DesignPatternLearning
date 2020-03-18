package Builder.MobilePackage.base;

import Builder.MobilePackage.pojo.MobilePackage;

public class AbstractBasePackage {
    // 手机套餐实例变量, 这里使用protected使其子类也能访问
    protected MobilePackage mobilePackage;
    
    public AbstractBasePackage() {
        this.mobilePackage = new MobilePackage();
    }
    
}
