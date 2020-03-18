package SimpleFactory.ChartLibrary;

import SimpleFactory.ChartLibrary.factory.ChartFactory;
import SimpleFactory.ChartLibrary.model.Chart;

public class Client {
    public static void main(String args[]) {
        Chart chart;
        chart = ChartFactory.getChart("histogram"); // 通过静态工厂方法创建产品
        chart.display();
    }
}
