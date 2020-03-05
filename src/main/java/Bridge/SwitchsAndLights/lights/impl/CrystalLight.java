package Bridge.SwitchsAndLights.lights.impl;

import Bridge.SwitchsAndLights.lights.ILight;

/**
 * 水晶灯实现
 * @author someexp
 *
 */
public class CrystalLight implements ILight{

    public void electricConnected() {
        // TODO Auto-generated method stub
        System.out.println("水晶灯被打开了...");
    }

    public void light() {
        // TODO Auto-generated method stub
        System.out.println("水晶灯照明...");
    }

    public void electricClosed() {
        // TODO Auto-generated method stub
        System.out.println("水晶灯被关闭了...");
    }
    
}
