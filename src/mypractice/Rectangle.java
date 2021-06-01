package mypractice;

public class Rectangle {

//    [Rectangle]
//
//    Create a class Rectangle
//    -Create these variables in the class: width, height, area(all double)
//    -Create these methods (non-static):
//            -setDimensions()
//                  -parameters: width, height (Do not name the parameters the same as your class variable names)
//                  -return: void
//                  -action: assigns the width and height of the object given from the parameters.
//    Also calculate the area of the rectangle in the method and store to the area variable. (area = width * height)
//
//            -getArea()
//                  -parameters: none
//                  -return: int
//                  -action: returns the area variable
//
//             -toString() generate the toString method as shown in class. See Murodil_only for screenshots of steps
//    -Create a class RectangleObjects
//    -Create Rectangle objects, call the setDimensions and getArea methods of the objects

    double width;
    double height;
    double area;

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area +
                '}';
    }

    public void setDimensions(double w, double h){
        height = h;
        width = w;
        area = (w * h);
    }
    public double getArea(){
        return area;
    }

}
class RectangleObjects{

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.setDimensions(5.7 , 10.5);
        System.out.println(rectangle.getArea());
    }
}


