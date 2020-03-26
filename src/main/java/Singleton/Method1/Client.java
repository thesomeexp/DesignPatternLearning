package Singleton.Method1;

import Singleton.Method1.pojo.Singleton;

// 客户端应用程序
public class Client {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		if (singleton1 == singleton2) {
			System.out.println("这是同一个对象");
		} else {
			System.out.println("这是不同对象");
		}
	}
}
