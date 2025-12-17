package FacadeExample.Shapes;

import FacadeExample.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        IO.println("Inside Circle");
    }
}
