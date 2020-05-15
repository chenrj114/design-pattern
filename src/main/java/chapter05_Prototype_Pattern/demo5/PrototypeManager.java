package chapter05_Prototype_Pattern.demo5;

import java.util.Hashtable;

/**
 * @ClassName PrototypeManager
 * @Description 原型管理器（使用饿汉式单例实现）
 * @Author rjchen
 * @Date 2020-05-15 11:03
 * @Version 1.0
 */
public class PrototypeManager {

    private final Hashtable ht = new Hashtable();
    private static final PrototypeManager pm = new PrototypeManager();

    private PrototypeManager() {
        ht.put("far", new FAR());
        ht.put("srs", new SRS());
    }

    public void addOfficialDocument(String key, OfficialDocument doc) {
        ht.put(key, doc);
    }

    //通过浅克隆获取新的公文对象
    public OfficialDocument getOfficialDocument(String key) {
        return ((OfficialDocument) ht.get(key)).clone();
    }

    public static PrototypeManager getPrototypeManager() {
        return pm;
    }
}
