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


             drawShape(new Circle());
             drawShape(new Square());
             drawShape(new Triangle());


    }

//    public static void drawShape(Circle shape) {
//        System.out.println("---- Drawing shape ----");
//        shape.draw();
//
//    }
//
//    public static void drawShape(Square shape) {
//        System.out.println("---- Drawing shape ----");
//        shape.draw();
//
//    }


    public static void drawShape(Shape shape) {         // --> 2 tane hepsi icin ayri ayri olacagina boyle parent class i kullanip hepsi icin yazabiliriz
        System.out.println("---- Drawing shape ----");
        shape.draw();

    }
}
