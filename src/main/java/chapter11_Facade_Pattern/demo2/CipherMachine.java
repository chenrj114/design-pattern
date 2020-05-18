package chapter11_Facade_Pattern.demo2;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName CipherMachine
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 15:50
 * @Version 1.0
 */
@Slf4j
public class CipherMachine {
    public String Encrypt(String plainText) {
        log.info("数据加密，将明文转换为密文：");
        String es = "";
        char[] chars = plainText.toCharArray();
        for (char ch : chars) {
            String c = String.valueOf(ch % 7);
            es += c;
        }
        log.info(es);
        return es;
    }
}