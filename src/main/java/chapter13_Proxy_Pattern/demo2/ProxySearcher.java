package chapter13_Proxy_Pattern.demo2;

/**
 * @ClassName ProxySearcher
 * @Description
 * @Author rjchen
 * @Date 2020-07-05 11:01
 * @Version 1.0
 */

public class ProxySearcher implements Searcher {

    private RealSearcher searcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;

    @Override
    public String dosearch(String userId, String keyWord) {
        //如果身份验证成功，则执行查询
        if (this.Validate(userId))
        {
            String result = searcher.dosearch(userId, keyWord); //调用真实主题对象的查询方法
            this.Log(userId); //记录查询日志
            return result; //返回查询结果
        }
        else
        {
            return null;
        }
    }
    //创建访问验证对象并调用其Validate()方法实现身份验证
    public boolean Validate(String userId)
    {
        validator = new AccessValidator();
        return validator.validate(userId);
    }

    //创建日志记录对象并调用其Log()方法实现日志记录
    public void Log(String userId)
    {
        logger = new Logger();
        logger.log(userId);
    }
}
