package Bridge.ImageParseInMultipleSystem;

import Bridge.ImageParseInMultipleSystem.images.GIFImage;
import Bridge.ImageParseInMultipleSystem.images.Image;
import Bridge.ImageParseInMultipleSystem.systems.ISystem;
import Bridge.ImageParseInMultipleSystem.systems.impl.WindowsSystem;

// 客户端模拟
public class Client {
    public static void main(String[] args) {
        Image image;
        ISystem os;
        // 模拟获取当前系统信息
        os = new WindowsSystem();
        image = new GIFImage(os);
        image.parseFile("TomSelfie");
        
    }
}
