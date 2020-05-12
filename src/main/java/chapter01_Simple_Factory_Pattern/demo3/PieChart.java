package chapter01_Simple_Factory_Pattern.demo3;

/**
 * @ClassName PieChart
 * @Description
 * @Author rjchen
 * @Date 2020-05-12 21:37
 * @Version 1.0
 */ //饼状图类：具体产品类
class PieChart implements Chart {
    public PieChart() {
        System.out.println("创建饼状图！");
    }

    public void display() {
        System.out.println("显示饼状图！");
    }
}
