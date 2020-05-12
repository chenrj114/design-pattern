package chapter01_Simple_Factory_Pattern.demo1;

/**
 * @ClassName Chart
 * @Description 提供各种不同外观的图表，例如柱状图、饼状图、折线图等。
 * 将所有图表的实现代码封装在一个Chart类中
 * @Author rjchen
 * @Date 2020-05-12 18:40
 * @Version 1.0
 */
class Chart {
    private String type; //图表类型

    public Chart(Object[][] data, String type) {
        this.type = type;
        if (type.equalsIgnoreCase("histogram")) {
            //初始化柱状图
        }
        else if (type.equalsIgnoreCase("pie")) {
            //初始化饼状图
        }
        else if (type.equalsIgnoreCase("line")) {
            //初始化折线图
        }
    }

    public void display() {
        if (this.type.equalsIgnoreCase("histogram")) {
            //显示柱状图
        }
        else if (this.type.equalsIgnoreCase("pie")) {
            //显示饼状图
        }
        else if (this.type.equalsIgnoreCase("line")) {
            //显示折线图
        }
    }
}
