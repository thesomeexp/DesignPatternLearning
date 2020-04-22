package Flyweight.FiveChessman;

import java.util.Random;

import Flyweight.FiveChessman.factory.FiveChessmanFactory;
import Flyweight.FiveChessman.object.AbstractChesman;

public class Client {
    public static void main(String[] args) {
        // 创建五子棋工厂
        FiveChessmanFactory fiveChessmanFactory 
            = FiveChessmanFactory.getInstance();
        // 随机数, 用来随机生成棋子对象
        Random random = new Random();
        int radom = 0;
        AbstractChesman abstractChesman = null;
        // 随机获得棋子
        for (int i = 0; i < 10; i++) {
            radom = random.nextInt(2);
            switch (radom) {
            // 获得黑棋
            case 0:
                abstractChesman = fiveChessmanFactory
                .getChessmanObject('B');
                break;
            case 1: 
                abstractChesman = fiveChessmanFactory
                .getChessmanObject('W');
                break;
            }
            
            if (abstractChesman != null) {
                // 设置妻子位置信息(x: 0-9 y: 0-15的随机数产生)
                // 棋子的位置可以使用其他对象, 这样就把一个棋子分成两个对象
                // 细粒度
                abstractChesman.point(i, random.nextInt(15));
            }
        }
    }
}
