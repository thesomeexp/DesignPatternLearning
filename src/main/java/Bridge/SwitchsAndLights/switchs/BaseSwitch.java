package Bridge.SwitchsAndLights.switchs;

import Bridge.SwitchsAndLights.lights.ILight;

/**
 * 开关顶层类
 * @author someexp
 *
 */


public class BaseSwitch {
    // 使用组合, 设置ILight为内部私有属性, 此为桥梁
    // 这是聚合的方式
    protected ILight light;
    
    // 构造方法注入外部light
    public BaseSwitch(ILight light) {
        this.light = light;
    }
    
    /**
     * 开灯方法
     */
    public final void makeLight() {
        // 打开开关, 接通电流
        this.light.electricConnected();
        // 照明
        this.light.light();
        // 关闭开关, 断开电流
        this.light.electricClosed();
    }
    
    
    
    
}