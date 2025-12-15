package DecoratorExample;

public class Circle implements Shape {

    @Override
    public void draw() {
        IO.print("Ritar en circle");
    }
}
