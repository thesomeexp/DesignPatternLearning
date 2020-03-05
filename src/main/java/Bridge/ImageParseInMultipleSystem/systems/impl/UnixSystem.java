package Bridge.ImageParseInMultipleSystem.systems.impl;

import Bridge.ImageParseInMultipleSystem.Matrix;
import Bridge.ImageParseInMultipleSystem.systems.ISystem;

public class UnixSystem implements ISystem{

    public void doPaint(Matrix m) {
        // TODO Auto-generated method stub
        System.out.println("模拟Unix绘制了图片");
    }
    
}
