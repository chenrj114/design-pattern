package chapter17_Iterator_Pattern.demo2;

import java.util.List;

/**
 * @ClassName ProductList
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 9:57
 * @Version 1.0
 */ //商品数据类：具体聚合类
class ProductList extends AbstractObjectList {
    public ProductList(List products) {
        super(products);
    }

    //实现创建迭代器对象的具体工厂方法
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
