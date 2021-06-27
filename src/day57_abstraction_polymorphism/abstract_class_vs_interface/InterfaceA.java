package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA {

    public static  final  String TYPE = "interface";

    double MAX_COUNT = 500;  // this is also public static final




    public abstract void absMethodD(int num);

    static void staticMethodE(String str){

        System.out.println("static methode called with str " + str);
    }

    default void defaultMethodF(){

    }

}
