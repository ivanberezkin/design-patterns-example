package FacadeExample;

import java.util.ArrayList;

public class ShapeMaker {

    private final static ShapeMaker sm = new ShapeMaker();

    private ShapeMaker (){}
    public void drawCircle(){
        ShapeFactory.getShape(ShapeTypes.CIRCLE).draw();
    }

    public void drawRectangle(){
        ShapeFactory.getShape(ShapeTypes.RECTANGLE).draw();
    }

    public void drawSquare(){
        ShapeFactory.getShape(ShapeTypes.SQUARE).draw();
    }

    public void drawAllShapes(){
        drawCircle();
        drawRectangle();
        drawSquare();
    }

    public static ShapeMaker getInstance(){
        return sm;
    }

}
