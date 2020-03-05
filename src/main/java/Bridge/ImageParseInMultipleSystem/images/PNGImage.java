package Bridge.ImageParseInMultipleSystem.images;

import Bridge.ImageParseInMultipleSystem.Matrix;
import Bridge.ImageParseInMultipleSystem.systems.ISystem;

public class PNGImage extends Image{

    public PNGImage(ISystem iSystem) {
        super(iSystem);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void parseFile(String fileName) {
        // TODO Auto-generated method stub
        // 模拟根据PNG解析成像素矩阵Matrix
        Matrix matrix = new Matrix();
        iSystem.doPaint(matrix);
        System.out.println(fileName + "格式为:PNG");
    }
    
}
