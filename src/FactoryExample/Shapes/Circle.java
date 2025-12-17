package FactoryExample.Shapes;

import FactoryExample.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        IO.println("Inside Circle");
    }
}
