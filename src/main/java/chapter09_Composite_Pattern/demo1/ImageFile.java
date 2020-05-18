package chapter09_Composite_Pattern.demo1;

/**
 * @ClassName wre
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 11:14
 * @Version 1.0
 */
//为了突出核心框架代码，我们对杀毒过程的实现进行了大量简化

//图像文件类
public class ImageFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public void killVirus() {
        //简化代码，模拟杀毒
        System.out.println("----对图像文件'" + name + "'进行杀毒");
    }
}

