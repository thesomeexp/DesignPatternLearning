package Flyweight.FiveChessman.object;

public abstract class AbstractChesman {
    // 棋子坐标
    protected int x;
    protected int y;
    
    // 棋子类别(黑/白)
    protected String chess;
    
    public AbstractChesman(String chess) {
        this.chess = chess;
    }
    
    // 点坐标设置
    public abstract void point(int x, int y);
    
    // 显示棋子信息
    public void show() {
        System.out.println(this.chess);
    }
}
