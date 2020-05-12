package chapter02_Factory_Method_Pattern.demo3;

import lombok.extern.slf4j.Slf4j;
import sun.rmi.runtime.Log;

/**
 * @ClassName FileLogger
 * @Description
 * @Author rjchen
 * @Date 2020-05-12 20:45
 * @Version 1.0
 */
@Slf4j
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        log.info("文件日志记录");
    }
}
