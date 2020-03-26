package Prototype.DailyLive.factory;

import Prototype.DailyLive.pojo.DailyLife;

/**
 * 工厂类
 * @author i
 *
 */
public interface ILifeFactory {
	// 生产DayLife对象
	public DailyLife getNewInstance();
}
