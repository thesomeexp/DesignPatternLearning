package Bridge.SwitchsAndLights.switchs;

import Bridge.SwitchsAndLights.lights.ILight;

/**
 * 增加了遥控开关功能类
 * @author someexp
 *
 */
public class RemoteControlSwitch extends BaseSwitch{
    // 构造方法
    public RemoteControlSwitch (ILight light) {
        super(light);
    }
    /**
     * 使用遥控开关控制开灯
     * @param openColor
     */
    public final void makeRemoteLight(int openColor) {
        // 打开开关, 接通电流
        this.light.electricConnected();
        // 照明
        this.light.light();
        String color = "";
        switch (openColor) {
        case 1:
            color = "暖色";
            break;
        case 2:
            color = "蓝色";
            break;
        case 3:
            color = "红色";
            break;
        default:
            color = "白色";
            break;
        }
        System.out.println("...现在灯光是" + color);
        this.light.electricClosed();
    }
    
    
    
    
    
    
    
    
}
