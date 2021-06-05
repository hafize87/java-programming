package day50_inheritance;


/*
Super class
parent class
base class
 */

public class Person {

    String name ;
    int age ;

    public void walk(){

        System.out.println(name + " is walk");
    }

    public void talk(){

        System.out.println("person is talk");
    }

    public void work(String job){
        System.out.println("person is working as " + job);

    }
}
