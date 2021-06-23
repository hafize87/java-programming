package day56_abstraction.transportation;

public class DrivableTest {
    public static void main(String[] args) {

        Tesla model3 = new Tesla();
        model3.hi();
        model3.transportPeople();
        model3.transportPeople();
        model3.autoPiloting();
        model3.cost(30);
        model3.bye();

        Plane plane = new Plane();
        plane.start();
        plane.hi();
        plane.transportPeople();
        plane.autoPiloting();
        plane.cost(250);
        plane.land();
        plane.stop();
        plane.bye();


        // polymorphism
        SelfDrivable sd1 = new Plane();
        SelfDrivable sd2 = new Tesla();
    }
}
