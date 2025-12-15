package DecoratorExample;

public class DecoratorPatternDemo {

    void main() {
        Shape c1 = new Circle();
        ShapeDecorator sd1 = new ShapeDecorator(c1);
        sd1.draw();
        IO.println();
        ShapeDecorator r1 = new ShapeDecorator(new Rectangle());
        r1.draw();
        IO.println();

        ShapeDecorator r1red = new RedShapeDecorator(new Rectangle());
        r1red.draw();

        ShapeDecorator c1red = new RedShapeDecorator(new Circle());
        c1red.draw();
        
    }
}
