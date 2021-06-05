package day50_inheritance.Overriding;

public class AnimalObjects {

    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.name = "Tarcin";
        animal.type = "Pitbul";
        animal.speak();

        Cat cat = new Cat();
        cat.speak();


        Dog dog = new Dog();
        dog.speak();
    }
}
