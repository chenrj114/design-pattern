package chapter08_Bridge_Pattern.demo3.abstraction;


import chapter08_Bridge_Pattern.demo3.implementor.ImageImp;

/**
 * @ClassName Image
 * @Description
 * @Author rjchen
 * @Date 2020-05-16 12:00
 * @Version 1.0
 */
//抽象图像类：抽象类
public abstract class Image {

    protected ImageImp imp;

    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}
