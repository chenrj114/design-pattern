package chapter11_Facade_Pattern.demo2;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName FileReader
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 15:46
 * @Version 1.0
 */
@Slf4j
public class FileReader {

    public String Read(String fileNameSrc) {
        log.info("读取文件，获取明文：");
        FileInputStream fs = null;
        StringBuilder sb = new StringBuilder();
        try {
            fs = new FileInputStream(fileNameSrc);
            int data;
            while ((data = fs.read()) != -1) {
                sb = sb.append((char) data);
            }
            fs.close();
            log.info(sb.toString());
        } catch (FileNotFoundException e) {
            log.info("文件不存在！");
        } catch (IOException e) {
            log.info("文件操作错误！");
        }
        return sb.toString();
    }
}
