package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB {

    public void absMethodA(){

    }


    @Override
    public void methodB(){

        System.out.println("methodB overridden version is called");
    }

    // @Override   --> static method cannot overridden , it can hidden
    public static void staticC(){
        System.out.println("static methodC is called");
    }

    @Override
    public void absMethodD(int num){

    }


}
