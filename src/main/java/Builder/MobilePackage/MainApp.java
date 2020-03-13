package Builder.MobilePackage;

import Builder.MobilePackage.director.MobileDirector;
import Builder.MobilePackage.itf.impl.MobileBuilderImpl1;
import Builder.MobilePackage.itf.impl.MobileBuilderImpl2;
import Builder.MobilePackage.pojo.MobilePackage;

public class MainApp {
    public static void main(String[] args) {
        // 创建指导者
        MobileDirector mobileDirector = new MobileDirector();
        // 套餐1
        MobileBuilderImpl1 mobileBuilderImpl1 = new MobileBuilderImpl1();
        // 套餐2
        MobileBuilderImpl2 mobileBuilderImpl2 = new MobileBuilderImpl2();
        
        printMessage(mobileDirector.createMobilePackage(mobileBuilderImpl1));
        printMessage(mobileDirector.createMobilePackage(mobileBuilderImpl2));
    }
    
    /**
     * 打印输出套餐信息
     */
    public static void printMessage(MobilePackage mobilePackage) {
        System.out.println("--话费:" + mobilePackage.getMoney() + 
                "\t短信:" + mobilePackage.getShortInfo() + 
                "条 \t彩铃:" + mobilePackage.getMusic());
    }
}
