package chapter17_Iterator_Pattern.demo1;

/**
 * @ClassName Aggregate
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 9:54
 * @Version 1.0
 */
interface Aggregate {
    Iterator createIterator();
}
