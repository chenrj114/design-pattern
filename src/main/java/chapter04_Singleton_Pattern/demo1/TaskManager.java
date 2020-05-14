package chapter04_Singleton_Pattern.demo1;

import lombok.extern.slf4j.Slf4j;

/**
 * @ClassName TaskManager
 * @Description
 * @Author rjchen
 * @Date 2020-05-14 15:49
 * @Version 1.0
 */
@Slf4j
public class TaskManager
{
    private static TaskManager tm = null;
    private TaskManager() {
        //初始化窗口
        log.info("初始化任务管理器");
    }
    public void  displayProcesses() {
        //显示进程
        log.info("显示任务管理器");
    }
    public void  displayServices() {
        //显示服务
        log.info("显示服务");
    }

    public static TaskManager getInstance()
    {
        if (tm == null)
        {
            tm = new TaskManager();
        }
        return tm;
    }
}
