package chapter06_Builder_Pattern.demo2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @ClassName Actor
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 12:02
 * @Version 1.0
 */
@Getter
@Setter
@ToString
public class Actor {

    private String type; //角色类型
    private String sex; //性别
    private String face; //脸型
    private String costume; //服装
    private String hairstyle; //发型

}
