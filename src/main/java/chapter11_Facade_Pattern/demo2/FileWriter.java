package chapter11_Facade_Pattern.demo2;

import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName FileWriter
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 15:52
 * @Version 1.0
 */
@Slf4j
public class FileWriter {

    public void Write(String encryptStr, String fileNameDes) {
        log.info("保存密文，写入文件。");
        FileOutputStream fs = null;
        try {
            fs = new FileOutputStream(fileNameDes);
            byte[] str = encryptStr.getBytes("UTF-8");
            fs.write(str, 0, str.length);
            fs.flush();
            fs.close();
        } catch (FileNotFoundException e) {
            log.info("文件不存在！");
        } catch (IOException e) {
            log.info(e.getMessage());
            log.info("文件操作错误！");
        }
    }
}
