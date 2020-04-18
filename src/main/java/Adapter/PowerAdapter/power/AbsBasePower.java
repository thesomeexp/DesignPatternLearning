package Adapter.PowerAdapter.power;
/**
 * 电源基类
 * @author i
 *
 */
public abstract class AbsBasePower {
    // 电压值
    private float power;
    // 单位
    private String unitString = "V";
    // 构造方法
    public AbsBasePower(float power) {
        this.power = power;
    }
    public float getPower() {
        return power;
    }
    public void setPower(float power) {
        this.power = power;
    }
    public String getUnitString() {
        return unitString;
    }
    public void setUnitString(String unitString) {
        this.unitString = unitString;
    }
    
}
