package day57_abstraction_polymorphism.abstract_class_vs_interface;

public abstract class AbstractA {

    public abstract void absMethodA();

    public void methodB(){

        System.out.println("methodB called");
    }

    public static void staticC(){
        System.out.println("static methodC is called");
    }
}
