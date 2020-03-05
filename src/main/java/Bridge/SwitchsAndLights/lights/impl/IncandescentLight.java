package Bridge.SwitchsAndLights.lights.impl;

import Bridge.SwitchsAndLights.lights.ILight;

/**
 * 白炽灯实现
 * @author someexp
 *
 */
public class IncandescentLight implements ILight{
    // 接通电流
    public void electricConnected() {
        // TODO Auto-generated method stub
        System.out.println("白炽灯被打开了...");
    }
    // 照明
    public void light() {
        // TODO Auto-generated method stub
        System.out.println("白炽灯照明...");
    }
    // 断开电流
    public void electricClosed() {
        // TODO Auto-generated method stub
        System.out.println("白炽灯关闭了...");
    }
    
}
