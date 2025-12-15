package DecoratorExample;

public class DecoratorPatternDemo {

    void main() {

        Circle c1 = new Circle();
        c1.draw();
        IO.println();
        Rectangle r1 = new Rectangle();
        r1.draw();
        IO.println();

        ShapeDecorator r1red = new RedShapeDecorator(new Rectangle());
        r1red.draw();

        ShapeDecorator c1red = new RedShapeDecorator(new Circle());
        c1red.draw();

    }
}
