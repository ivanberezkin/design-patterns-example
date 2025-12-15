package DecoratorExample;

public class RedShapeDecorator extends ShapeDecorator{
    public Shape shape;

    public RedShapeDecorator(Shape shape) {
        super(shape);
        this.shape = shape;
    }

    @Override
    public void draw(){
        shape.draw();
        setRedBoarder();
    }

    private void setRedBoarder(){
        IO.println(" med en röd border");
    }
}
