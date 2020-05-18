package chapter10_Decorator_Pattern.demo4;

/**
 * @ClassName Decorator
 * @Description
 * @Author rjchen
 * @Date 2020-05-18 14:03
 * @Version 1.0
 */

public class Decorator implements Document {

    private Document document;

    public Decorator(Document document) {
        this.document = document;
    }

    @Override
    public void display() {
        document.display();
    }
}
