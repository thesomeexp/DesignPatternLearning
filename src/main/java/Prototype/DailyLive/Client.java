package Prototype.DailyLive;


import Prototype.DailyLive.factory.ILifeFactory;
import Prototype.DailyLive.factory.impl.LifeFactoryImpl;
import Prototype.DailyLive.pojo.DailyLife;

// 主应用程序
public class Client {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		// 创建工厂
		ILifeFactory lifeFactory = new LifeFactoryImpl();
		// 打印DailyLife默认内容
		DailyLife dailyLife0 = lifeFactory.getNewInstance();
		dailyLife0.print();
		
		// 再次获得DailyLife, 修改getUp内容后输出内容
		System.out.println("--------");
		DailyLife dailyLife = lifeFactory.getNewInstance();
		dailyLife.setGetUpsString("早上赖床了~7:15才起床");
		dailyLife.print();
		
		// 再次获得DailLife, 修改getUp内容后输出内容
		System.out.println("--------");
		DailyLife dailyLife2 = lifeFactory.getNewInstance();
		dailyLife2.setByBusString(new String("test"));
		dailyLife2.print();
		
		System.out.println("000000000");
		System.out.println("使用clone时, 是从内存中直接复制"
				+ "二进制流, 重新分配内存块给克隆对象");
		System.out.println(dailyLife0.toString());
		System.out.println(dailyLife.toString());
		System.out.println(dailyLife2.toString());
		System.out.println("buBus的hash");
		System.out.println(System.identityHashCode(dailyLife0.getByBusString()));
		System.out.println(System.identityHashCode(dailyLife.getByBusString()));
		System.out.println(System.identityHashCode(dailyLife2.getByBusString()));
		System.out.println("通过反射修改1的String, 理论上0也会变");
		Class clz = dailyLife.getByBusString().getClass();
		// 需要使用getDeclaredField(), getField()只能获取公共成员字段
		java.lang.reflect.Field field = clz.getDeclaredField("value");
		field.setAccessible(true);
		char[] ch = (char[])field.get(dailyLife.getByBusString());
		ch[1]='8';
		
		dailyLife0.print();
		
	}
}
