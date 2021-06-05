package day50_inheritance.Overriding;

import day50_inheritance.Overriding.Animal;

public class Cat extends Animal {


    public void jump(){

        System.out.println("Cat can jump...");
    }

    @Override
    public void speak(){

        System.out.println("Cat is saying Meow..");
    }
}
