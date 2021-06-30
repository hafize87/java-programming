package day58_polymorphism;

public class SuperMan extends Father implements Worker{

    @Override
    public void work(String job){
        System.out.println("Superman is working as " + job);

    }
    public double getPaid(){

        System.out.println("");

        return 8000;

    }

}
