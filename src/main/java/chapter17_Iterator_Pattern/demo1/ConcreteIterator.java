package chapter17_Iterator_Pattern.demo1;

/**
 * @ClassName ConcreteIterator
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 9:54
 * @Version 1.0
 */
class ConcreteIterator implements Iterator {
    private ConcreteAggregate objects; //维持一个对具体聚合对象的引用，以便于访问存储在聚合对象中的数据
    private int cursor; //定义一个游标，用于记录当前访问位置
    public ConcreteIterator(ConcreteAggregate objects) {
        this.objects=objects;
    }

    public void first() {
        //......
    }

    public void next() {
        //......
    }

    public boolean hasNext() {
        //......
        return true;
    }

    public Object currentItem() {
        //......
        return null;
    }
}
