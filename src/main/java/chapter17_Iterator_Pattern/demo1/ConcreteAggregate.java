package chapter17_Iterator_Pattern.demo1;

/**
 * @ClassName ConcreteAggregate
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 9:53
 * @Version 1.0
 */
class ConcreteAggregate implements Aggregate {
    //......
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
	//......
}
