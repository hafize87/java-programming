package day57_abstraction_polymorphism.abstract_class_vs_interface.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        triangle.draw();


        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(new Triangle());
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(circle);
        shapes.add(square);
        shapes.add(new Circle());
        shapes.add(new Square());

      //  System.out.println(shapes);  prints hashcode of objects

        for(Shape each: shapes){
           each.draw();
        }


    }
}
