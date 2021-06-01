package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {

        // create traffic light object
        TrafficLight light = new TrafficLight();

      //  light.color = "red";
        // we will assign /update the value of color using a method of the class

        light.changeColor("red");

     //   System.out.println(light.color);  DIRECT access to variable. Not recommended.

        // call method to access the variable

        light.showColor();

        light.changeColor("green");
        light.showColor();

        TrafficLight light1 = new TrafficLight();

        // light1.color = "black";   we cant control it

        light1.changeColor("blue");
        light1.showColor();



    }
}
