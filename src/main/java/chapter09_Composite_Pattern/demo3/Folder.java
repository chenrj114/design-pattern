package chapter09_Composite_Pattern.demo3;

import java.util.ArrayList;

/**
 * @ClassName Folder
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 11:44
 * @Version 1.0
 */
//文件夹类：容器构件
public class Folder extends AbstractFile {

    //定义集合fileList，用于存储AbstractFile类型的成员
    private ArrayList<AbstractFile> fileList=new ArrayList<AbstractFile>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(AbstractFile file) {
        fileList.add(file);
    }

    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    public AbstractFile getChild(int i) {
        return (AbstractFile)fileList.get(i);
    }

    public void killVirus() {

        System.out.println("****对文件夹'" + name + "'进行杀毒");  //模拟杀毒

        //递归调用成员构件的killVirus()方法
        for(Object obj : fileList) {
            ((AbstractFile)obj).killVirus();
        }
    }
}