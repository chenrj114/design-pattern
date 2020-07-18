package chapter18_Mediator_Pattern.demo4;

import chapter18_Mediator_Pattern.demo3.Component;
/**
 * @ClassName Lable
 * @Description
 * @Author rjchen
 * @Date 2020/7/18 14:25
 * @Version 1.0
 */

//文本标签类：具体同事类
class Label extends Component {
    public void update() {
        System.out.println("文本标签内容改变，客户信息总数加1。");
    }
}

