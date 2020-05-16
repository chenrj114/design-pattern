package chapter08_Bridge_Pattern.demo3;

import chapter08_Bridge_Pattern.demo3.abstraction.Image;
import chapter08_Bridge_Pattern.demo3.implementor.ImageImp;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020-05-16 12:09
 * @Version 1.0
 */
public class Client {
    public static void main(String args[]) {
        Image image;
        ImageImp imp;
        image = (Image)XMLUtil.getBean("image");    //加载jpg格式
        imp = (ImageImp)XMLUtil.getBean("os");      //加载windows调用
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}
