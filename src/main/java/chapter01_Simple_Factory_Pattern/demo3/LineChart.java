package chapter01_Simple_Factory_Pattern.demo3;

/**
 * @ClassName LineChart
 * @Description
 * @Author rjchen
 * @Date 2020-05-12 21:37
 * @Version 1.0
 */ //折线图类：具体产品类
class LineChart implements Chart {
    public LineChart() {
        System.out.println("创建折线图！");
    }

    public void display() {
        System.out.println("显示折线图！");
    }
}
