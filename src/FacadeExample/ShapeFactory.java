package FacadeExample;

import FacadeExample.Shapes.Circle;
import FacadeExample.Shapes.Rectangle;
import FacadeExample.Shapes.Square;

public final class ShapeFactory {
    private ShapeFactory() {
    }

    public static Shape getShape(ShapeTypes shape){

        switch(shape){
            case CIRCLE -> {
                return new Circle();
            }
            case SQUARE -> {
                return new Square();
            }
            case RECTANGLE -> {
                return new Rectangle();
            }
            default -> throw new IllegalArgumentException();
        }
    }
}
