package Adapter.PowerAdapter;

import Adapter.PowerAdapter.adapter.AdapterPower12;
import Adapter.PowerAdapter.adapter.AdapterPower12Ext;
import Adapter.PowerAdapter.power.v12.IPower12;
import Adapter.PowerAdapter.power.v12.Power12;
import Adapter.PowerAdapter.power.v220.Power220;

public class Client {
	public static void main(String[] args) {
		// 首先生成一个220V电源对象
		Power220 power220 = new Power220();
		power220.output220v();
		
		IPower12 power12 = new Power12();
		power12.output12v();
		
		// 上面是正常情况
		// 使用电源适配器将220V电源转换为12V电源
		System.out.println("\n---电源适配器转换中---");
		IPower12 adapterIPower12 = new AdapterPower12(power220);
		adapterIPower12.output12v();
		System.out.println("---电源适配器转换结束");
		
		// 类适配器实现
		System.out.println("\n---类适配器 电源适配器转换中...");
		IPower12 adaIPower12Ext = new AdapterPower12Ext(power220);
		adaIPower12Ext.output12v();
		System.out.println("---类适配器 电源适配器转换结束");
	}
}
