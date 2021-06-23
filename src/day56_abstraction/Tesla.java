package day56_abstraction;

public class Tesla extends Transportation{


    @Override
    public void transportPeople() {

        System.out.println("Tesla is transportation people on the road");
    }

    @Override
    public void cost(int mile) {

        System.out.println("Tesla costs " + (mile* 0.10)  + " to drive " + mile + " miles.");
    }
}
