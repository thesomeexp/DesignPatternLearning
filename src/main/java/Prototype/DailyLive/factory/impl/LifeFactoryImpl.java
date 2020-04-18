package Prototype.DailyLive.factory.impl;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DayDV;

import Prototype.DailyLive.factory.ILifeFactory;
import Prototype.DailyLive.pojo.DailyLife;
/**
 * 工厂类实现
 * @author i
 *
 */
public class LifeFactoryImpl implements ILifeFactory{
    // DailyLife对象实例用于初始化
    private static DailyLife dailyLife = null;
    
    @Override
    public DailyLife getNewInstance() {
        // 判断dailyLife是否为空
        if (dailyLife == null) {
            // 如果为null
            // 输出是使用new产生的对象. 注意: new这里只能使用一次哦~
            System.out.println("new DailyLife ");
            // 设置dailyLife内容
            dailyLife = new DailyLife();
            dailyLife.setGetUpsString("7:00起床");
            String refString = new String("引用公交aa");
            refString.replace("aa", "中途改变成地铁");
            System.out.println(refString);
            dailyLife.setByBusString(refString);
            dailyLife.setGetFoodString("8:30到公司附近的公交站下车, "
                    + "经过路旁的早餐车顺便买早餐");
            dailyLife.setNoonString("午餐在公司附近小餐馆解决, 然后在"
                    + "办公室座椅小睡");
            dailyLife.setAfternoonWorkString("开始了下午的工作");
            dailyLife.setGoHomeString("17:30准时下班");
            dailyLife.setNightString("晚上休闲娱乐");
        } else {
            // 如果不为null
            // 输出是使用clone方法产生的对象
            System.out.println("clone DailyLife");
            // 将clone对象赋值给dailyLife, 返回
            dailyLife = dailyLife.clone();
        }
        return dailyLife;
    }

}
