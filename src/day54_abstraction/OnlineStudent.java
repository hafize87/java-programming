package day54_abstraction;

public class OnlineStudent extends Student{

    @Override
    public void attendClass(){

        System.out.println("Online student is attending the class using zoom");
    }


   //  public abstract void askQuestion(); ERROR --> abstract method cannot be in normal class
}
