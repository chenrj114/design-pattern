package chapter18_Mediator_Pattern.demo2;

/**
 * @ClassName ConcreteColleague
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 14:04
 * @Version 1.0
 */
class ConcreteColleague extends Colleague {
    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    //实现自身方法
    public void method1() {
		//......
    }
}
