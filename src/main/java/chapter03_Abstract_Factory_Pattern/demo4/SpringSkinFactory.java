package chapter03_Abstract_Factory_Pattern.demo4;

import chapter03_Abstract_Factory_Pattern.demo4.SkinFactory;
import chapter03_Abstract_Factory_Pattern.demo4.product.*;

/**
 * @ClassName SpringSkinFactory
 * @Description
 * @Author rjchen
 * @Date 2020-05-13 14:06
 * @Version 1.0
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
