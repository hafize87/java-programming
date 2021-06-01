package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {

        Animal animal = new Animal();

        System.out.println(animal.type);  // some animal
        animal.eat();
        animal.eat("grass");
        animal.speak();

        // create object cheetahObj
        Animal cheetah = new Animal();

        cheetah.type = "cheetah";  // reassigned
        System.out.println(cheetah.type);  // change value

        cheetah.eat();
        cheetah.eat("meat");
        cheetah.speak();
    }
}
