package Flyweight.FiveChessman.object;

public class BlackChessman extends AbstractChesman {

    /**
     * 构造方法, 初始化黑棋子
     * @param chess
     */
    public BlackChessman() {
        super("●");
        System.out.println("==== 黑棋子构造方法执行");
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
