package Bridge.SwitchsAndLights;

import Bridge.SwitchsAndLights.lights.ILight;
import Bridge.SwitchsAndLights.lights.impl.CrystalLight;
import Bridge.SwitchsAndLights.lights.impl.IncandescentLight;
import Bridge.SwitchsAndLights.switchs.BaseSwitch;
import Bridge.SwitchsAndLights.switchs.RemoteControlSwitch;

/**
 * 客户端应用程序
 * @author someexp
 *
 */
public class ClientForBridge {
    public static void main(String[] args) {
        // 白炽灯实例
        ILight incandescentLight = new IncandescentLight();
        // 水晶灯实例
        ILight crystalLight = new CrystalLight();
        
        // 一般开关
        System.out.println("--- 一般开关 ---");
        BaseSwitch switch1 = new BaseSwitch(incandescentLight);
        switch1.makeLight();
        // 遥控开关
        System.out.println("--- 遥控开关 ---");
        RemoteControlSwitch remoteControlSwitch = new RemoteControlSwitch(crystalLight);
        remoteControlSwitch.makeRemoteLight(1);
        
        // 遥控开关打开白炽灯
        System.out.println("--- 遥控开关 ---");
        RemoteControlSwitch remoteControlSwitch2 = new RemoteControlSwitch(incandescentLight);
        remoteControlSwitch2.makeRemoteLight(1);
    }
}
