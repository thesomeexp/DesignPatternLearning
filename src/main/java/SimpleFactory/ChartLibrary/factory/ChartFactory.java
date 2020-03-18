package SimpleFactory.ChartLibrary.factory;

import SimpleFactory.ChartLibrary.model.Chart;
import SimpleFactory.ChartLibrary.model.impl.HistogramChart;
import SimpleFactory.ChartLibrary.model.impl.LineChart;
import SimpleFactory.ChartLibrary.model.impl.PieChart;

// 图表工厂类，充当工厂类
public class ChartFactory {
    // 静态工厂方法
    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图！");
        }
        else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图！");
        }
        else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("初始化设置折线图！");            
        }
        return chart;
    }
}
