package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA {

    public abstract void absMethodD(int num);

    static void staticMethodE(String str){

        System.out.println("static methode called with str " + str);
    }

    default void defaultMethodF(){

    }

}
