package chapter05_Prototype_Pattern.demo3;

/**
 * @ClassName Attachment
 * @Description 附件类Attachment
 * @Author rjchen
 * @Date 2020-05-15 10:24
 * @Version 1.0
 */
public class Attachment {
    private String name; //附件名

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void download() {
        System.out.println("下载附件，文件名为" + name);
    }
}
