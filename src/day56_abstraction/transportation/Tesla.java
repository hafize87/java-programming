package day56_abstraction.transportation;

import day56_abstraction.greeting.Greeting;

public class Tesla extends Transportation implements SelfDrivable , Greeting {


    @Override
    public void transportPeople() {

        System.out.println("Tesla is transportation people on the road");
    }

    @Override
    public void cost(int mile) {

        System.out.println("Tesla costs " + (mile* 0.10)  + " to drive " + mile + " miles.");
    }

    @Override
    public void autoPiloting() {

        System.out.println("Automation");
    }

    @Override
    public void hi() {

        System.out.println("Tesla is saying hi");
    }

    @Override
    public void bye() {

        System.out.println("Tesla is saying bye");
    }
}
