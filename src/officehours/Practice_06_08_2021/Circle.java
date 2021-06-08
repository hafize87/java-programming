package officehours.Practice_06_08_2021;

public class Circle extends Shape {

    double radius;
    double diameter = radius * 2;

    @Override
    public void calculateArea() {

        area = Math.PI * (radius *radius);
    }

    @Override
    public void calculatePerimeter() {

        perimeter = 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
