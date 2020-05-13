package chapter03_Abstract_Factory_Pattern.demo4;

import chapter03_Abstract_Factory_Pattern.demo4.product.Button;
import chapter03_Abstract_Factory_Pattern.demo4.product.ComboBox;
import chapter03_Abstract_Factory_Pattern.demo4.product.TextField;

/**
 * @ClassName SkinFactory
 * @Description
 * @Author rjchen
 * @Date 2020-05-13 14:05
 * @Version 1.0
 */

/**
 *  如果还要添加一个 单选按钮(RadioButton) , 并且为其提供不同皮肤的风格化显示
 *  首先需要修改抽象工厂接口SkinFactory，在其中新增声明创建单选按钮的方法，
 *  然后逐个修改具体工厂类，增加相应方法以实现在不同的皮肤中创建单选按钮，
 *  此外还需要修改客户端，否则单选按钮无法应用于现有系统。
 *
 *  在抽象工厂模式中，增加新的产品族很方便，但是增加新的产品等级结构很麻烦，
 *  抽象工厂模式的这种性质称为“开闭原则”的倾斜性。
 */
public interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}
