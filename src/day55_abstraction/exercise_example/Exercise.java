package day55_abstraction.exercise_example;

public abstract class Exercise {

    public void start(){    // non-abstract method

        System.out.println("Warming up and starting the exercise");
    }

    /*

     */
    public abstract void perform();  // abstract method - method without body, just signature

    public abstract int getCaloriesCount(int minutes);


}
