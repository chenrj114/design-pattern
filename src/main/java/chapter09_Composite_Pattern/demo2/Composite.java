package chapter09_Composite_Pattern.demo2;

import java.util.ArrayList;

/**
 * @ClassName Composite
 * @Description 在组合模式结构中，由于容器构件中仍然可以包含容器构件，因此在对容器构件进行处理时需要使用递归算法
 * @Author rjchen
 * @Date 2020-05-18 11:35
 * @Version 1.0
 */
public class Composite extends Component {

    private ArrayList<Component> list = new ArrayList<Component>();

    public void add(Component c) {
        list.add(c);
    }

    public void remove(Component c) {
        list.remove(c);
    }

    public Component getChild(int i) {
        return (Component)list.get(i);
    }

    public void operation() {
        //容器构件具体业务方法的实现
        //递归调用成员构件的业务方法
        for(Object obj:list) {
            ((Component)obj).operation();
        }
    }
}
