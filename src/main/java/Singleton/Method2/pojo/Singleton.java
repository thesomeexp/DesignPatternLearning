package Singleton.Method2.pojo;
/**
 * 单例设计模式方法2
 * @author i
 *
 */
public class Singleton {
	// 类共享的实例对象
	private static final Singleton singleton = new Singleton();
	// 私有构造方法, 使其无法被new
	private Singleton() {
		System.out.println("private Constructor");
	}
	// 获得单例方法
	public static Singleton getInstance() {
		// 直接返回共享对象
		return singleton;
	}
}
