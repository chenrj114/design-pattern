package chapter17_Iterator_Pattern.demo1;

/**
 * @ClassName Iterator
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 9:53
 * @Version 1.0
 */

interface Iterator {
    public void first(); //将游标指向第一个元素
    public void next(); //将游标指向下一个元素
    public boolean hasNext(); //判断是否存在下一个元素
    public Object currentItem(); //获取游标指向的当前元素
}

