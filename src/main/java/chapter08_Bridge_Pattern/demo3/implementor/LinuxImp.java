package chapter08_Bridge_Pattern.demo3.implementor;

import chapter08_Bridge_Pattern.demo3.Matrix;

/**
 * @ClassName LinuxImp
 * @Description
 * @Author rjchen
 * @Date 2020-05-16 12:01
 * @Version 1.0
 */
//Linux操作系统实现类：具体实现类
public class LinuxImp implements ImageImp {
    public void doPaint(Matrix m) {
        //调用Linux系统的绘制函数绘制像素矩阵
        System.out.print("在Linux操作系统中显示图像：");
    }
}
