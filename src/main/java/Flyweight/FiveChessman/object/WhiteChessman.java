package Flyweight.FiveChessman.object;

public class WhiteChessman extends AbstractChesman{

    public WhiteChessman() {
        super("○");
        System.out.println("==== 白棋子构造方法执行");
    }

    /**
     * 实现父类方法, 设置位置信息
     */
    @Override
    public void point(int x, int y) {
        this.x = x;
        this.y = y;
        this.show();
    }
    
}
