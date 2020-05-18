package chapter11_Facade_Pattern.demo2;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName Program
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 15:58
 * @Version 1.0
 */
@Slf4j
public class Program {
    static void main(String[] args)
    {
        EncryptFacade ef = new EncryptFacade();
        ef.FileEncrypt("src.txt", "des.txt");
    }
}
