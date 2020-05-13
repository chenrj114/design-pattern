package chapter03_Abstract_Factory_Pattern.demo3;

import chapter03_Abstract_Factory_Pattern.demo3.product.AbstractProductA;
import chapter03_Abstract_Factory_Pattern.demo3.product.AbstractProductB;

/**
 * @ClassName AbstractFactory
 * @Description 由于工厂方法模式中的每个工厂只生产一类产品，可能会导致系统中存在大量的工厂类
 * 有时候我们希望一个工厂可以提供多个产品对象，而不是单一的产品对象，
 * 如一个电器工厂，它可以生产电视机、电冰箱、空调等多种电器，而不是只生产某一种电器
 *
 * 工厂生产的具体产品并不是一个简单的对象，而是多个位于不同产品等级结构、属于不同类型的具体产品时就可以使用抽象工厂模式。
 *
 * @Author rjchen
 * @Date 2020-05-13 13:35
 * @Version 1.0
 */
abstract class AbstractFactory {
    public abstract AbstractProductA createProductA(); //工厂方法一
    public abstract AbstractProductB createProductB(); //工厂方法二
}
