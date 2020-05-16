package chapter08_Bridge_Pattern.demo3.abstraction;

import chapter08_Bridge_Pattern.demo3.Matrix;

/**
 * @ClassName PNGImage
 * @Description
 * @Author rjchen
 * @Date 2020-05-16 12:01
 * @Version 1.0
 */
//PNG格式图像：扩充抽象类
public class PNGImage extends Image {
    public void parseFile(String fileName) {
        //模拟解析PNG文件并获得一个像素矩阵对象m;
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为PNG。");
    }
}
