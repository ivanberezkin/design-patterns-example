package FactoryExample.Shapes;

import FactoryExample.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle");
    }
}
