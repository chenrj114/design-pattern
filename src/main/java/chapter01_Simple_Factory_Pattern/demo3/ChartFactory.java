package chapter01_Simple_Factory_Pattern.demo3;

/**
 * 简单工厂模式当系统中需要引入新产品时，由于静态工厂方法通过所传入参数的不同来创建不同的产品，
 * 这必定要修改工厂类的源代码，将违背“开闭原则”
 */
//图表工厂类：工厂类
public class ChartFactory {
    //静态工厂方法
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
