package chapter09_Composite_Pattern.demo4;

/**
 * @ClassName AbstractFile
 * @Description 由于在AbstractFile中声明了大量用于管理和访问成员构件的方法，例如add()、remove()等方法，
 * 我们不得不在新增的文件类中实现这些方法
 * 为了简化代码，我们有以下两个解决方案：将叶子构件的add()、remove()等方法的实现代码移至AbstractFile类中
 * @Author rjchen
 * @Date 2020-05-18 11:53
 * @Version 1.0
 */
//提供默认实现的抽象构件类
public abstract class AbstractFile {

    public void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    public void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    public AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    public abstract void killVirus();
}
