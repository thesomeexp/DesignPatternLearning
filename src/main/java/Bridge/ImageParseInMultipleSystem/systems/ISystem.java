package Bridge.ImageParseInMultipleSystem.systems;

import Bridge.ImageParseInMultipleSystem.Matrix;
/**
 * 系统接口, 模拟系统调用不同函数来处理绘制矩阵
 * @author someexp
 *
 */
public interface ISystem {
    public void doPaint(Matrix m);
}
