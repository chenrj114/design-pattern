package chapter05_Prototype_Pattern.demo5;

import lombok.Cleanup;

/**
 * @ClassName SRS
 * @Description
 * @Author rjchen
 * @Date 2020-05-15 11:01
 * @Version 1.0
 */
public class SRS implements OfficialDocument, Cloneable {

    @Override
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException exception) {
            exception.printStackTrace();
            System.out.println("不支持复制! ");
        }
        return srs;
    }

    @Override
    public void display() {
        System.out.println("《软件需求规格说明书》");
    }
}
