package chapter20_Observer_Pattern.demo2;

/**
 * @ClassName Observer
 * @Description 抽象观察类
 * @Author rjchen
 * @Date 2020/7/18 15:55
 * @Version 1.0
 */

interface Observer {
    public String getName();
    public void setName(String name);
    public void help(); //声明支援盟友方法
    public void beAttacked(AllyControlCenter acc); //声明遭受攻击方法
}

