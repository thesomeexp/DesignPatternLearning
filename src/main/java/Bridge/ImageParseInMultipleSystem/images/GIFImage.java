package Bridge.ImageParseInMultipleSystem.images;

import Bridge.ImageParseInMultipleSystem.Matrix;
import Bridge.ImageParseInMultipleSystem.systems.ISystem;

public class GIFImage extends Image{

    public GIFImage(ISystem iSystem) {
        super(iSystem);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void parseFile(String fileName) {
        // TODO Auto-generated method stub
        // 模拟传来的GIF文件解析成像素矩阵Matrix
        Matrix matrix = new Matrix();
        iSystem.doPaint(matrix);
        System.out.println(fileName + "格式为:GIF");
    }
    
}
