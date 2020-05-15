package chapter05_Prototype_Pattern.demo4;

import lombok.Getter;
import lombok.Setter;

import java.io.*;

/**
 * @ClassName WeeklyLog
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 10:39
 * @Version 1.0
 */
@Setter
@Getter
public class WeeklyLog implements Serializable {
    private String name;
    private String date;
    private String content;
    private Attachment attachment;

    //使用序列化技术实现深克隆
    public WeeklyLog deepClone() throws CloneNotSupportedException, IOException, ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        //将对象从流中取出
        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeeklyLog)ois.readObject();
    }
}
