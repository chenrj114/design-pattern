package chapter01_Simple_Factory_Pattern;

import chapter01_Simple_Factory_Pattern.demo2.Factory;
import chapter01_Simple_Factory_Pattern.demo2.Product;
import chapter01_Simple_Factory_Pattern.demo3.Chart;
import chapter01_Simple_Factory_Pattern.demo3.ChartFactory;

import chapter01_Simple_Factory_Pattern.demo4.SimpleProduct;
import org.junit.Test;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020-05-12 18:45
 * @Version 1.0
 */
public class Client {

    @Test
    public void test2() {
        Product product;
        product = Factory.getProduct("A"); //通过工厂类创建产品对象
        product.methodSame();
        product.methodDiff();

        product = Factory.getProduct("B");
        product.methodSame();
        product.methodDiff();
    }

    @Test
    public void test3() {
        Chart chart;
        chart = ChartFactory.getChart("histogram"); //通过静态工厂方法创建产品
        chart.display();
    }

    /**
     * 静态工厂方法移至抽象产品类后的使用
     */
    @Test
    public void test4(){
        SimpleProduct simpleProduct = null;
        simpleProduct = simpleProduct.getProduct("A");
        simpleProduct.methodSame();
        simpleProduct.methodDiff();

        simpleProduct = simpleProduct.getProduct("B");
        simpleProduct.methodSame();
        simpleProduct.methodDiff();
    }
}
