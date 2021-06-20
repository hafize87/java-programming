package day55_abstraction.exercise_example;

public class AtTheGym {

    public static void main(String[] args) {

       // Exercise exercise = new Exercise();  ERROR

        Exercise exercise = new Running();   // another benefit of abstraction , that we can have one variable of type abstract class and object can be any sub class. it is call POlYMORHISM
                                            // polymorphism benefit of abstraction


        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 mins - calories = " + exercise.getCaloriesCount(30) );

        running.start();
        running.perform();
        System.out.println("Running 30 mins - calories = " + running.getCaloriesCount(30) );

        swimming.start();
        swimming.perform();
        System.out.println("Swimming 30 mins - calories = " + swimming.getCaloriesCount(30) );

        freeWeight.start();
        freeWeight.perform();
        System.out.println("Freeweight 30 mins - calories = " + freeWeight.getCaloriesCount(30) );

    }
}
