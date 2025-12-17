package FactoryExample;

import FactoryExample.Shapes.Circle;

import java.util.ArrayList;

public class FactoryPatternDemo {

FactoryPatternDemo(){
    ArrayList<Shape> shapes = new ArrayList<>();

    try {
    shapes.add(ShapeFactory.getShape(ShapeTypes.CIRCLE));
    shapes.add(ShapeFactory.getShape(ShapeTypes.RECTANGLE));
    shapes.add(ShapeFactory.getShape(ShapeTypes.SQUARE));
    shapes.add(ShapeFactory.getShape(ShapeTypes.KORV));
    }catch (IllegalArgumentException e){
        IO.println("Okänd shape angiven");
    }

    for (Shape shape : shapes) {
        shape.draw();
    }
}

    void main() {

    }

}
