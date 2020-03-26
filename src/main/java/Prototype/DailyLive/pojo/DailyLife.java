package Prototype.DailyLive.pojo;
/**
 * 日常生活
 * @author i
 *
 */
public class DailyLife implements Cloneable {
	// 实现了Cloneable的类重载clone方法产生新对象时
	// 是不会执行类的构造方法的, 也就是说调用clone不执行构造方法
	public DailyLife() {
		System.out.println("--- 执行构造方法了 ---");
	}
	// 起床
	private String getUpsString;
	// 坐公交
	private String byBusString;
	// 下车, 买早餐
	private String getFoodString;
	// 中午小酣
	private String noonString;
	// 下午开始工作
	private String afternoonWorkString;
	// 下班回家
	private String goHomeString;
	// 晚上休闲
	private String nightString;
	public String getGetUpsString() {
		return getUpsString;
	}
	public void setGetUpsString(String getUpsString) {
		this.getUpsString = getUpsString;
	}
	public String getByBusString() {
		return byBusString;
	}
	public void setByBusString(String byBusString) {
		this.byBusString = byBusString;
	}
	public String getGetFoodString() {
		return getFoodString;
	}
	public void setGetFoodString(String getFoodString) {
		this.getFoodString = getFoodString;
	}
	public String getNoonString() {
		return noonString;
	}
	public void setNoonString(String noonString) {
		this.noonString = noonString;
	}
	public String getAfternoonWorkString() {
		return afternoonWorkString;
	}
	public void setAfternoonWorkString(String afternoonWorkString) {
		this.afternoonWorkString = afternoonWorkString;
	}
	public String getGoHomeString() {
		return goHomeString;
	}
	public void setGoHomeString(String goHomeString) {
		this.goHomeString = goHomeString;
	}
	public String getNightString() {
		return nightString;
	}
	public void setNightString(String nightString) {
		this.nightString = nightString;
	}
	public void print() {
		System.out.println(this.getUpsString);
		System.out.println(this.byBusString);
		System.out.println(this.getFoodString);
		System.out.println(this.noonString);
		System.out.println(this.afternoonWorkString);
		System.out.println(this.goHomeString);
		System.out.println(this.nightString);
	}
	/**
	 * clone
	 */
	@Override
	public DailyLife clone() {
		try {
			return (DailyLife) super.clone();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
