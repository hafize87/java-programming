package day57_abstraction_polymorphism.abstract_class_vs_interface.shapes;

public class ShapeTest {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        triangle.draw();


        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();
    }
}
