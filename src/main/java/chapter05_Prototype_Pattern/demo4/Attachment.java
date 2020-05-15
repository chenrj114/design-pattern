package chapter05_Prototype_Pattern.demo4;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @ClassName Attachment
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 10:38
 * @Version 1.0
 */
@Getter
@Setter
public class Attachment implements Serializable {
    private String name;

    public void download() {
        System.out.println("下载附件，文件名为" + name);
    }
}
