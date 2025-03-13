package dsa.designPattern.factory;

public class TestMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.type("circle");
        circle.draw();
    }

}
