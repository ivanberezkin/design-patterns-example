package FacadeExample.Shapes;

import FacadeExample.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square");
    }
}


