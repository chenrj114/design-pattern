package chapter13_Proxy_Pattern.demo2;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName AccessValidator
 * @Description
 * @Author rjchen
 * @Date 2020-07-05 10:53
 * @Version 1.0
 */
@Slf4j
public class AccessValidator {

    public boolean validate(String userId) {
        log.info("在数据库中验证用户'{}'是否是合法用户？",userId);
        if (userId.equals("Alan")) {
            log.info("{}登录成功", userId);
            return true;
        } else {
            log.info("{}登录失败", userId);
            return false;
        }
    }
}
