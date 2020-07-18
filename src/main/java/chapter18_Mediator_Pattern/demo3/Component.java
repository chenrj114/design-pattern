package chapter18_Mediator_Pattern.demo3;

/**
 * @ClassName Component
 * @Description 抽象组件类：抽象同事类
 * @Author rjchen
 * @Date 2020/7/18 14:06
 * @Version 1.0
 */
public abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    //转发调用
    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();
}
