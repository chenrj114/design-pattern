package chapter09_Composite_Pattern.demo4;

import chapter09_Composite_Pattern.demo3.ImageFile;
import chapter09_Composite_Pattern.demo3.TextFile;
import chapter09_Composite_Pattern.demo3.VideoFile;

/**
 * @ClassName Client
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 11:54
 * @Version 1.0
 */
public class Client {
    public static void main(String args[]) {
        //不能透明处理叶子构件
        ImageFile file1,file2;
        TextFile file3,file4;
        VideoFile file5;
        AbstractFile folder1,folder2,folder3,folder4;
        //其他代码省略
    }
}