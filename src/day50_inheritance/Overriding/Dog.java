package day50_inheritance.Overriding;

import day50_inheritance.Overriding.Animal;

public class Dog extends Animal {


    public void run(){

        System.out.println("Dog is running.. ");
    }

    @Override
    public void speak(){

        System.out.println("Dog is barking..");
    }
}
