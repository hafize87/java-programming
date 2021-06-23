package day56_abstraction.transportation;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {


    @Override
    public void hi() {

        System.out.println("Welcome");

    }

    @Override
    public void bye() {

        System.out.println("see you");
    }

    @Override
    public void autoPiloting() {

        System.out.println("Flying on Auto-Pilot mode");

    }

    @Override
    public void transportPeople() {

        System.out.println("Flying people");

    }

    @Override
    public void cost(int mile) {

        System.out.println("Plane costs " + (mile* 25)  + " to fly "  + mile + " miles.");

    }

    public void land() {

        System.out.println("plane is landing ");
    }
}
