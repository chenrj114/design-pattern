package chapter05_Prototype_Pattern.demo3;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName WeeklyLog
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 10:28
 * @Version 1.0
 */
@Setter
@Getter
public class WeeklyLog implements Cloneable {
    private String name;
    private String date;
    private String content;
    private Attachment attachment;

    @Override
    public WeeklyLog clone() throws CloneNotSupportedException {
        Object object = null;
        try {
            object = super.clone();
            return (WeeklyLog) object;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("不支持复制！");
        }
        return null;
    }
}
