package chapter16_Interpreter_Pattern.demo1;

import java.util.HashMap;

/**
 * @ClassName Context
 * @Description
 * @Author rjchen
 * @Date 2020/7/17 19:17
 * @Version 1.0
 */

public class Context {

    private final HashMap map = new HashMap();

    public void assign(String key, String value) {
        //往环境类中设值
    }

    public String lookup(String key) {
        //获取存储在环境类中的值
        return null;
    }
}
