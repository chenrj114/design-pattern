package chapter09_Composite_Pattern.demo3;

/**
 * @ClassName AbstractFile
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 11:43
 * @Version 1.0
 */


//抽象文件类：抽象构件
public abstract class AbstractFile {

    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();

}

