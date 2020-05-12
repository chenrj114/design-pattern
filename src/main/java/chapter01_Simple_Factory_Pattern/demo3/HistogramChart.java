package chapter01_Simple_Factory_Pattern.demo3;

/**
 * @ClassName ChartFactory
 * @Description
 * @Author rjchen
 * @Date 2020-05-12 19:14
 * @Version 1.0
 */
//抽象图表接口：抽象产品类

//柱状图类：具体产品类
class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("创建柱状图！");
    }

    public void display() {
        System.out.println("显示柱状图！");
    }
}
