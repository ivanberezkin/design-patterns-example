package DecoratorExample;

public class RedShapeDecorator extends ShapeDecorator{
    public Shape shape;

    public RedShapeDecorator(Shape shape) {
        this.shape = shape;
        super(shape);
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
