package chapter13_Proxy_Pattern.demo2;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName RealSearcher
 * @Description
 * @Author rjchen
 * @Date 2020-07-05 10:59
 * @Version 1.0
 */
@Slf4j
public class RealSearcher implements Searcher {
    @Override
    public String dosearch(String userId, String keyWord) {
        log.info("用户'{}'使用关键词'{}'查询商务信息！", userId, keyWord);
        return "返回具体内容";
    }
}
