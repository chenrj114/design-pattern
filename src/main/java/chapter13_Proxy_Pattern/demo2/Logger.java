package chapter13_Proxy_Pattern.demo2;


import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName Logger
 * @Description
 * @Author rjchen
 * @Date 2020-07-05 10:57
 * @Version 1.0
 */
@Slf4j
public class Logger {

    public void log(String useId) {
        log.info("更新数据库，用户'{}'查询次数加1！", useId);
    }
}
