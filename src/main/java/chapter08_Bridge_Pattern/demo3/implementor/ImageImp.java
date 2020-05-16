package chapter08_Bridge_Pattern.demo3.implementor;

import chapter08_Bridge_Pattern.demo3.Matrix;

/**
 * @ClassName ImageImp
 * @Description
 * @Author rjchen
 * @Date 2020-05-16 11:59
 * @Version 1.0
 */
//抽象操作系统实现类：实现类接口
public interface ImageImp {
    public void doPaint(Matrix m);  //显示像素矩阵m
}
