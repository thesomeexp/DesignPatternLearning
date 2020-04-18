package Adapter.PowerAdapter.power.v12;

import Adapter.PowerAdapter.power.AbsBasePower;
/**
 * 12V电源
 * @author i
 *
 */
public class Power12 extends AbsBasePower implements IPower12 {
    // 构造方法
    public Power12() {
        super(12);
    }
    // 12V电源输出
    public void output12v() {
        System.out.println("----这是[" + this.getPower() + this.getUnitString() + 
                "]电源!---");
    }
}
